package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.util.Useful._

// generate phase
case object Generate extends PhaseObj[Unit, GenerateConfig, Unit] {
  val name = "generate"
  val help = "Generate JavaScript files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: GenerateConfig
  ): Unit = for ((script, k) <- Generator.generate(config.debug).zipWithIndex) {
    mkdir(s"$GENERATE_DIR")
    mkdir(s"$GENERATE_DIR/scripts")
    dumpFile(script, s"$GENERATE_DIR/scripts/$k.js")
  }

  def defaultConfig: GenerateConfig = GenerateConfig()
  val options: List[PhaseOption[GenerateConfig]] = List()
}

// Generate phase config
case class GenerateConfig(
    var debug: Boolean = false
) extends Config
