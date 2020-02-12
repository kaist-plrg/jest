package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.algorithm._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import kr.ac.kaist.ires.util._
import scala.io.Source

// ParseAlgo phase
case object ParseAlgo extends PhaseObj[Unit, ParseAlgoConfig, Algorithm] {
  val name = "parse-algo"
  val help = "Parses algorithm files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: ParseAlgoConfig
  ): Algorithm = Algorithm(getFirstFilename(iresConfig, "parse-algo"))

  def defaultConfig: ParseAlgoConfig = ParseAlgoConfig()
  val options: List[PhaseOption[ParseAlgoConfig]] = List()
}

// ParseAlgo phase config
case class ParseAlgoConfig() extends Config
