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

  val exception = s"$INJECT_DIR/exception"
  mkdir(exception)
  mkdir(TOUCHED_ALGO_DIR)
  mkdir(TOUCHED_INST_DIR)

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: InjectConfig
  ): Unit = jestConfig.fileNames.headOption match {
    case Some(filename) =>
      val parseResult = parse(Script(Nil), fileReader(filename))
      if (parseResult.successful)
        dumpFile(Injector(parseResult.get, debug = jestConfig.debug).result, filename)
    case None =>
      println("injecting assertions...")

      var count = 0
      var total = 0
      for {
        file <- walkTree(PROGRAMS_DIR)
        name = file.getName
        filename = file.toString if jsFilter(filename)
        parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
        script = parseResult.get
      } try {
        val injector = Injector(script, debug = jestConfig.debug)
        val injected = injector.result
        total += 1
        if (injector.isAsync) count += 1
        mkdir(TESTS_DIR)
        dumpFile(injected, s"$TESTS_DIR/$name")

        // dump touched
        val visited = injector.visited
        val toJsonExt = changeExt("js", "json")
        dumpJson(visited.touchedAlgos, s"$TOUCHED_ALGO_DIR/${toJsonExt(name)}")
        dumpJson(visited.instCovered, s"$TOUCHED_INST_DIR/${toJsonExt(name)}")
      } catch {
        case e: Throwable => {
          println(s"* Warning: $e")
          dumpFile(Map(("message" -> e.getMessage()), ("stacktrace" -> e.getStackTrace().mkString(LINE_SEP))).toJson, s"$exception/$name.json")
        }
      }
      if (jestConfig.debug) println(s"[AsyncInejcted]: ${getPercent(count, total)}")
  }

  def defaultConfig: InjectConfig = InjectConfig()
  val options: List[PhaseOption[InjectConfig]] = Nil
}

// Inject phase config
case class InjectConfig() extends Config
