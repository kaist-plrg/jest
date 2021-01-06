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

  case class Result(desc: String, set: Set[String], rank: Int)
  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: LocalizeConfig
  ): Unit = {
    println("Localize specification/engine bugs...")

    mkdir(s"$RESULT_DIR/localized")
    val nf = getPrintWriter(s"$RESULT_DIR/localized/rank.tsv")
    def log(seq: Any*): Unit = nf.println(seq.mkString("\t"))
    log("bug id", "answer", "fail description", "failed set", "rank")

    mkdir(LOCALIZE_DIR)
    var table: Map[Answer, List[Result]] = Map()
    for {
      failedFile <- walkTree(FAILED_DIR)
      name = failedFile.getName
      filename = failedFile.toString if jsonFilter(filename)
    } {
      val target = removedExt(name)
      println(s"Loading failed tests for $target...")
      val dir = s"$LOCALIZE_DIR/$target"
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
          val result = localizer.getResult(ER1b)
          result.dump(s"$dir/$i/result")
          val topRanked = result.agAlgoScores.head._1
          println(s"$target[$i] - ${failedSet.toSeq.mkString(", ")} - $topRanked")

          // if answers exist, then save result
          if (config.answer) {
            val answerMap: Map[String, Set[Answer]] =
              readJson[Map[String, Set[Answer]]](s"$ANSWER_DIR/$name")
            answerMap.get(failedDesc) match {
              case Some(answers) => answers.foreach {
                case answer if answer.algo != "" =>
                  val rank = result.getAgAlgoRank(answer.algo)
                  table += answer -> (Result(
                    failedDesc,
                    failedSet,
                    rank
                  ) :: table.getOrElse(answer, Nil))
                case _ =>
              }
              case None =>
            }
          }
          nf.flush
        }
      }
    }

    if (config.answer) {
      val snf = getPrintWriter(s"$RESULT_DIR/localized/figure-5")
      def slog(any: Any): Unit = snf.println(any)
      var count: Map[Int, Int] = Map()
      table.toSeq.sortBy(_._1.id).foreach {
        case (Answer(id, algo), results) =>
          val Result(desc, set, rank) = results.sortBy(_.rank).head
          count += rank -> (count.getOrElse(rank, 0) + 1)
          log(id, algo, desc, set.toSeq.mkString(", "), rank)
      }
      slog("---------")
      slog("rank | # ")
      slog("---------")
      count.toSeq.sortBy(_._1).foreach {
        case (rank, k) => slog(f"$rank%4d | $k%2d")
      }
      slog("---------")
      snf.close
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
