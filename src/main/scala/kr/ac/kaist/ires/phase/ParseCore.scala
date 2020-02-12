package kr.ac.kaist.ires.phase
import kr.ac.kaist.ires.core._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import kr.ac.kaist.ires.util.Useful._

// ParseCore phase
case object ParseCore extends PhaseObj[Unit, ParseCoreConfig, Program] {
  val name = "parse-core"
  val help = "Parse Core files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: ParseCoreConfig
  ): Program = {
    val filename = getFirstFilename(iresConfig, "parse-core")
    Parser.fileToProgram(filename)
  }

  def defaultConfig: ParseCoreConfig = ParseCoreConfig()
  val options: List[PhaseOption[ParseCoreConfig]] = List()
}

// ParseCore phase config
case class ParseCoreConfig() extends Config
