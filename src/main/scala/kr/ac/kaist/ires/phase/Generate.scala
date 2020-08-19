package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._

// generate phase
case object Generate extends PhaseObj[Unit, GenerateConfig, Unit] {
  val name = "generate"
  val help = "Generate JavaScript files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: GenerateConfig
  ): Unit = Generator.generate(
    debug = config.debug,
    maxIter = config.iter,
    loadDir = config.loadDir
  )

  def defaultConfig: GenerateConfig = GenerateConfig()
  val options: List[PhaseOption[GenerateConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process."),
    ("iter", NumOption((c, i) => c.iter = i),
      "maximum number of iterations for generations (default: 100)."),
    ("load", StrOption((c, str) => c.loadDir = Some(str)),
      "load existing scripts from the given directory"),
  )
}

// Generate phase config
case class GenerateConfig(
    var debug: Boolean = false,
    var iter: Int = 100,
    var loadDir: Option[String] = None
) extends Config
