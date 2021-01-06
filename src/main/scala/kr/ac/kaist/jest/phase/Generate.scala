package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.generator.Generator
import kr.ac.kaist.jest.util._
import kr.ac.kaist.jest.util.Useful._
import kr.ac.kaist.jest.model.Parser._
import kr.ac.kaist.jest.sampler.ValidityChecker
import scala.collection.immutable.{ Set => ScalaSet }

// generate phase
case object Generate extends PhaseObj[Unit, GenerateConfig, Unit] {
  val name = "generate"
  val help = "generates JavaScript programs using mutators."

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: GenerateConfig
  ): Unit = {
    Generator.generate(config.iter)
  }

  def defaultConfig: GenerateConfig = GenerateConfig()
  val options: List[PhaseOption[GenerateConfig]] = List(
    ("iter", NumOption((c, i) => c.iter = i),
      "maximum number of iterations for generations (default: 10).")
  )
}

// Generate phase config
case class GenerateConfig(
    var iter: Int = 10,
    var loadDir: Option[String] = None
) extends Config
