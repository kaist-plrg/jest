package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.injector.Injector
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import spray.json._

// Inject phase
case object Inject extends PhaseObj[Unit, InjectConfig, Unit] {
  val name = "inject"
  val help = "Inject semantics assertions into JavaScript files."

  val exceptionDirectory = s"$DIFF_TEST_DIR/inject_exceptions"
  mkdir(exceptionDirectory)

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: InjectConfig
  ): Unit = iresConfig.fileNames.headOption match {
    case Some(filename) =>
      val parseResult = parse(Script(Nil), fileReader(filename))
      if (parseResult.successful)
        dumpFile(Injector(parseResult.get, config.debug).result, filename)
    case None => for {
      file <- walkTree(GENERATED_DIR)
      name = file.getName
      filename = file.toString if jsFilter(filename)
      parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
      script = parseResult.get
    } try {
      val injected = Injector(script, config.debug).result
      println(s"- $INJECTED_DIR/$name")
      println(s"  $script")
      println(s"  ====>")
      println(s"  $injected")
      mkdir(INJECTED_DIR)
      dumpFile(injected, s"$INJECTED_DIR/$name")
    } catch {
      case e: Throwable => {
        println(s"* Warning: $e")
        dumpFile(Map(("message" -> e.getMessage()), ("stacktrace" -> e.getStackTrace().mkString(LINE_SEP))).toJson, s"$exceptionDirectory/$name.json")
      }
    }
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
