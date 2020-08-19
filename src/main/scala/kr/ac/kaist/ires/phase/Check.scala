package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.checker._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._

//import scala.collection.mutable.Map

import spray.json._

// Check phase
case object Check extends PhaseObj[Unit, CheckConfig, Unit] with DefaultJsonProtocol {
  val name = "check"
  val help = "Get injected script and check whoose fault"

  val engines = List("node", "xst", "qjs", "gnode")
  val targets = engines :+ "spec"
  val dirs = targets.map(t => (t, s"$FAILED_DIR/$t.json")).toMap
  mkdir(FAILED_DIR)

  var failedScripts: Map[String, Map[CheckResult, Set[String]]] = Map()

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: CheckConfig
  ): Unit = iresConfig.fileNames.headOption match {
    case Some(filename) =>
      val helper: String = readFile(s"$DIFF_TEST_DIR/helper.js")
      val injected = readFile(filename)
      val tempPath = "__temp__.js"
      val comment = injected.split("\n").head

      dumpFile(helper + injected, tempPath)
      val checker = Checker(tempPath, engines, comment, config.debug)
      deleteFile(tempPath)

      checker.result.foreach {
        case (e, rs) =>
          println(s"\n[$e]")
          rs.foreach(println)
      }
    case None =>
      val helper: String = readFile(s"$DIFF_TEST_DIR/helper.js")
      val tempPath = "__temp__.js"

      targets.foreach(t => { failedScripts = failedScripts + (t -> Map()) })
      for {
        file <- (walkTree(INJECTED_DIR) ++ walkTree(ERRORS_DIR))
        name = file.getName
        filename = file.toString if jsFilter(filename)
      } {
        val injected = readFile(filename)
        val comment = injected.split("\n").head

        dumpFile(helper + injected, tempPath)
        val checker = Checker(tempPath, engines, comment, config.debug)
        deleteFile(tempPath)

        val fails: Map[String, Set[CheckResult]] = checker.result
        if (fails.nonEmpty && config.debug) {
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
            val m = failedScripts(e)
            resultSet.foreach(r => {
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

    //if (config.debug) println(s"[AsyncInejcted]: ${getPercent(count, total)}")
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
