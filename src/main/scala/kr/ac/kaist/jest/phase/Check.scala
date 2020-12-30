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
  val help = "Get injected script and check whoose fault"
  val dirs = Checker.targets.map(t => (t, s"$FAILED_DIR/$t.json")).toMap
  mkdir(FAILED_DIR)

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
      val checker = Checker(tempPath, comment, feature, jestConfig.debug || config.debug)
      deleteFile(tempPath)

      checker.result.foreach {
        case (e, rs) =>
          println(s"\n[$e]")
          rs.foreach(println)
      }
    case None =>
      println("differential testing...")

      val tempPath = "__temp__.js"
      Checker.targets.foreach(t => { failedScripts = failedScripts + (t -> Map()) })
      for {
        file <- walkTree(INJECTED_DIR)
        name = file.getName
        filename = file.toString if jsFilter(filename)
      } {
        val injected = readFile(filename)
        val comment = injected.split(LINE_SEP).head
        val feature = injected.split(LINE_SEP).tail.head.substring("// feature: ".length)

        dumpFile(Checker.helper + injected, tempPath)
        val checker = Checker(tempPath, comment, feature, jestConfig.debug || config.debug)
        deleteFile(tempPath)

        val fails: Map[String, Set[CheckResult]] = checker.result
        if (fails.nonEmpty && jestConfig.debug || config.debug) {
          val hr = "-" * 80
          println(hr)
          println(name)
          fails.foreach {
            case (e, rs) if rs.nonEmpty =>
              println(s"\n[$e]")
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
  }

  def defaultConfig: CheckConfig = CheckConfig()
  val options: List[PhaseOption[CheckConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process.")
  )
}

// Inject phase config
case class CheckConfig(
    var debug: Boolean = false
) extends Config
