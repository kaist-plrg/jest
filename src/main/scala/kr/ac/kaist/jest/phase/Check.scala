package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.checker._
import kr.ac.kaist.jest.util._
import kr.ac.kaist.jest.util.Useful._

//import scala.collection.mutable.Map

import spray.json._

// Check phase
case object Check extends PhaseObj[Unit, CheckConfig, Unit] with DefaultJsonProtocol {
  val name = "check"
  val help = "performs differential testing for given tests."
  val dirs = Checker.targets.map(t => (t, s"$BUGS_DIR/${getTargetName(t)}.json")).toMap
  mkdir(BUGS_DIR)

  var failedScripts: Map[String, Map[CheckResult, Set[String]]] = Map()

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: CheckConfig
  ): Unit = jestConfig.fileNames.headOption match {
    case Some(filename) =>
      val injected = readFile(filename)
      val tempPath = "__temp__.js"
      val comment = injected.split(LINE_SEP).head
      val feature = injected.split(LINE_SEP).tail.head.substring("// feature: ".length)

      dumpFile(Checker.helper + injected, tempPath)
      val checker = Checker(tempPath, comment, feature)
      deleteFile(tempPath)

      checker.result.foreach {
        case (e, rs) =>
          println(s"\n[${getTargetName(e)}]")
          rs.foreach(println)
      }
    case None =>
      println("---------------- check -----------------")
      println("differential testing...")

      val tempPath = "__temp__.js"
      Checker.targets.foreach(t => { failedScripts = failedScripts + (t -> Map()) })
      for {
        file <- walkTree(TESTS_DIR)
        name = file.getName
        filename = file.toString if jsFilter(filename)
      } {
        val injected = readFile(filename)
        val comment = injected.split(LINE_SEP).head
        val feature = injected.split(LINE_SEP).tail.head.substring("// feature: ".length)

        dumpFile(Checker.helper + injected, tempPath)
        val checker = Checker(tempPath, comment, feature)
        deleteFile(tempPath)

        val fails: Map[String, Set[CheckResult]] = checker.result
        if (fails.nonEmpty && DETAIL) {
          val hr = "-" * 80
          println(hr)
          println(name)
          fails.foreach {
            case (e, rs) if rs.nonEmpty =>
              println(s"\n[${getTargetName(e)}]")
              rs.foreach(println)
            case _ =>
          }
          println(hr)
        }

        fails.foreach {
          case (e, resultSet) =>
            resultSet.foreach(r => {
              val m = failedScripts(e)
              val s = m.getOrElse(r, Set())
              failedScripts = failedScripts + (e -> (m + (r -> (s + name))))
            })
        }
      }

      failedScripts.foreach {
        case (e, m) => {
          val m_string = m.map { case (k, v) => (k.toString, v) }
          dumpJson(m_string, dirs(e))
        }
      }

      println(s"dumped failed cases in $BUGS_DIR.")
  }

  def defaultConfig: CheckConfig = CheckConfig()
  val options: List[PhaseOption[CheckConfig]] = Nil
}

// Inject phase config
case class CheckConfig() extends Config
