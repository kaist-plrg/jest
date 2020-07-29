package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.injector.Injector
import kr.ac.kaist.ires.util.Useful._

// Inject phase
case object Inject extends PhaseObj[Unit, InjectConfig, Unit] {
  val name = "inject"
  val help = "Inject semantics assertions into JavaScript files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: InjectConfig
  ): Unit = iresConfig.fileNames.headOption match {
    case Some(filename) =>
      val parseResult = parse(Script(Nil), fileReader(filename))
      if (parseResult.successful) dumpFile(Injector(parseResult.get).result, filename)
    case None => for {
      file <- walkTree(GENERATED_DIR)
      name = file.getName
      filename = file.toString if jsFilter(filename)
      parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
      script = parseResult.get
    } try {
      val injected = Injector(script).result
      println(s"- $INJECTED_DIR/$name")
      println(s"  $script")
      println(s"  ====>")
      println(s"  $injected")
      dumpFile(injected, s"$INJECTED_DIR/$name")
    } catch {
      case e: Throwable => println(s"* Warning: $e")
    }
  }

  def defaultConfig: InjectConfig = InjectConfig()
  val options: List[PhaseOption[InjectConfig]] = List()
}

// Inject phase config
case class InjectConfig() extends Config
