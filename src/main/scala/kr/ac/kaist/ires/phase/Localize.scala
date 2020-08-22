package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.ir.beautify
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.model.{ Algorithm, Script }
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.localizer._
import kr.ac.kaist.ires.checker._
import spray.json._
import kr.ac.kaist.ires.localizer.AnswerProtocol._

// localize phase
case object Localize extends PhaseObj[Unit, LocalizeConfig, Unit] with DefaultJsonProtocol {
  val name = "localize"
  val help = "Localize JavaScript files."

  val failedPath: String = s"$DIFF_TEST_DIR/failed"
  val localizedDir: String = LOCALIZED_DIR

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
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
                    val Answer(id, algo) = answer
                    val algoRank = result.getAlgoRank(algo)
                    val agAlgoRank = result.getAgAlgoRank(algo)
                    add(target)
                    add(formula.name)
                    add(failedDesc)
                    add(failedSet.toSeq.sorted.mkString(", "))
                    add(id)
                    add(algo)
                    add(algoRank)
                    add(agAlgoRank)
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
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process."),
    ("answer", BoolOption(c => c.answer = true),
      "show ranks of answer algorithms.")
  )
}

// Localize phase config
case class LocalizeConfig(
    var debug: Boolean = false,
    var answer: Boolean = false
) extends Config
