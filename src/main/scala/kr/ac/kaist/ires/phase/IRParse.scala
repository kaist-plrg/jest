package kr.ac.kaist.ires.phase
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import kr.ac.kaist.ires.util.Useful._

// IRParse phase
case object IRParse extends PhaseObj[Unit, IRParseConfig, Program] {
  val name = "parse-ir"
  val help = "Parse IR files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: IRParseConfig
  ): Program = {
    val filename = getFirstFilename(iresConfig, "parse-ir")
    Parser.fileToProgram(filename)
  }

  def defaultConfig: IRParseConfig = IRParseConfig()
  val options: List[PhaseOption[IRParseConfig]] = List()
}

// IRParse phase config
case class IRParseConfig() extends Config
