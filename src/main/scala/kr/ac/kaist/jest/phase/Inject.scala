package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.model.Parser._
import kr.ac.kaist.jest.injector.Injector
import kr.ac.kaist.jest.util._
import kr.ac.kaist.jest.util.Useful._
import spray.json._

// Inject phase
case object Inject extends PhaseObj[Unit, InjectConfig, Unit] {
  val name = "inject"
  val help = "constructs tests by injecting semantics assertions to given JavaScript programs."

  val exceptionDirectory = s"$DIFF_TEST_DIR/inject_exceptions"
  mkdir(exceptionDirectory)
  mkdir(s"$TOUCHED_DIR/algo")
  mkdir(s"$TOUCHED_DIR/inst")

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: InjectConfig
  ): Unit = jestConfig.fileNames.headOption match {
    case Some(filename) =>
      val parseResult = parse(Script(Nil), fileReader(filename))
      if (parseResult.successful)
        dumpFile(Injector(parseResult.get, debug = jestConfig.debug || config.debug).result, filename)
    case None =>
      println("injecting assertions...")

      var count = 0
      var total = 0
      for {
        file <- walkTree(GENERATED_DIR)
        name = file.getName
        filename = file.toString if jsFilter(filename)
        parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
        script = parseResult.get
      } try {
        val injector = Injector(script, debug = jestConfig.debug || config.debug)
        val injected = injector.result
        total += 1
        if (injector.isAsync) count += 1
        mkdir(INJECTED_DIR)
        dumpFile(injected, s"$INJECTED_DIR/$name")

        // dump touched
        val visited = injector.visited
        val toJsonExt = changeExt("js", "json")
        dumpJson(visited.instCovered, s"$TOUCHED_DIR/inst/${toJsonExt(name)}")
        dumpJson(visited.touchedAlgos, s"$TOUCHED_DIR/algo/${toJsonExt(name)}")
      } catch {
        case e: Throwable => {
          println(s"* Warning: $e")
          dumpFile(Map(("message" -> e.getMessage()), ("stacktrace" -> e.getStackTrace().mkString(LINE_SEP))).toJson, s"$exceptionDirectory/$name.json")
        }
      }
      if (jestConfig.debug || config.debug) println(s"[AsyncInejcted]: ${getPercent(count, total)}")
  }

  def defaultConfig: InjectConfig = InjectConfig()
  val options: List[PhaseOption[InjectConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process.")
  )
}

// Inject phase config
case class InjectConfig(
    var debug: Boolean = false
) extends Config
