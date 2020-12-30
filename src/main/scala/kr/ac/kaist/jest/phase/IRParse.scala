package kr.ac.kaist.jest.phase
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.{ LINE_SEP, JESTConfig }
import kr.ac.kaist.jest.util.Useful._

// IRParse phase
case object IRParse extends PhaseObj[Unit, IRParseConfig, Program] {
  val name = "parse-ir"
  val help = "Parse IR files."

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: IRParseConfig
  ): Program = {
    val filename = getFirstFilename(jestConfig, "parse-ir")
    Parser.fileToProgram(filename)
  }

  def defaultConfig: IRParseConfig = IRParseConfig()
  val options: List[PhaseOption[IRParseConfig]] = List()
}

// IRParse phase config
case class IRParseConfig() extends Config
