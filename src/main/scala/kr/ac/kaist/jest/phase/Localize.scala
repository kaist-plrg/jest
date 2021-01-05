package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.generator.Generator
import kr.ac.kaist.jest.ir.beautify
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.model.{ Algorithm, Script }
import kr.ac.kaist.jest.model.Parser._
import kr.ac.kaist.jest.util._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.localizer._
import kr.ac.kaist.jest.checker._
import spray.json._
import kr.ac.kaist.jest.localizer.AnswerProtocol._

// localize phase
case object Localize extends PhaseObj[Unit, LocalizeConfig, Unit] with DefaultJsonProtocol {
  val name = "localize"
  val help = "localizes found bugs in the specification."

  val failedPath: String = s"$DIFF_TEST_DIR/failed"
  val localizedDir: String = LOCALIZED_DIR

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: LocalizeConfig
  ): Unit = {
    println("localizing bugs...")

    mkdir(LOCALIZED_DIR)
    val nf = getPrintWriter(s"$LOCALIZED_DIR/summary.tsv")
    def add(any: Any): Unit = nf.print(s"$any\t")
    def newline: Unit = nf.println

    List("target", "formula", "fail description", "failed set", "answer", "id", "algo", "aggregated").foreach(add)
    newline

    for {
      failedFile <- walkTree(failedPath)
      name = failedFile.getName
      filename = failedFile.toString if jsonFilter(filename)
    } {
      val target = removedExt(name)
      val dir = s"$LOCALIZED_DIR/$target"
      mkdir(dir)

      // generating localizer
      val m = readJson[Map[String, Set[String]]](filename)
      val failedSet = m.map(_._2).foldLeft(Set[String]())(_ ++ _)
      val base = Localizer(failedSet)

      m.zipWithIndex.foreach {
        case ((failedDesc, failedSet), i) => {
          val localizer = base.updated(failedSet)
          localizer.dump(s"$dir/$i")
          mkdir(s"$dir/$i/result")
          FORMULAS.foreach(formula => {
            val result = localizer.getResult(formula)
            result.dump(s"$dir/$i/result/$formula")

            // if answers exist, then save result
            if (config.answer) {
              val answerMap: Map[String, Set[Answer]] = readJson[Map[String, Set[Answer]]](s"$ANSWER_DIR/$name")
              answerMap.get(failedDesc) match {
                case Some(answers) => {
                  answers.foreach(answer => {
                    add(target)
                    add(formula.name)
                    add(failedDesc)
                    add(failedSet.toSeq.sorted.mkString(", "))

                    val Answer(id, algo) = answer
                    if (algo == "") {
                      add("-")
                      add("-")
                      add("-")
                      add("-")
                    } else {
                      val algoRank = result.getAlgoRank(algo)
                      val agAlgoRank = result.getAgAlgoRank(algo)
                      add(id)
                      add(algo)
                      add(algoRank)
                      add(agAlgoRank)
                    }
                    newline
                  })
                }
                case None =>
                  add(target)
                  add(formula.name)
                  add(failedDesc)
                  add(failedSet.toSeq.sorted.mkString(", "))
                  newline
              }
            }
            nf.flush
          })
        }
      }
    }
    nf.close
  }

  def defaultConfig: LocalizeConfig = LocalizeConfig()
  val options: List[PhaseOption[LocalizeConfig]] = List(
    ("answer", BoolOption(c => c.answer = true),
      "show ranks of answer algorithms.")
  )
}

// Localize phase config
case class LocalizeConfig(
    var answer: Boolean = false
) extends Config
