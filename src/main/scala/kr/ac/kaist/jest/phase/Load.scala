package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest.{ LINE_SEP, JESTConfig }
import kr.ac.kaist.jest.model.{ Parser => JSParser, _ }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.util.Useful._
import scala.io.Source

// Load phase
case object Load extends PhaseObj[Script, LoadConfig, State] {
  val name = "load"
  val help = "read script object and using global, convert to State object."

  def apply(
    script: Script,
    jestConfig: JESTConfig,
    config: LoadConfig
  ): State = ModelHelper.initState(
    script,
    jestConfig.fileNames.lift(0).getOrElse("unknown")
  )

  def defaultConfig: LoadConfig = LoadConfig()
  val options: List[PhaseOption[LoadConfig]] = List()
}

// Parse phase config
case class LoadConfig() extends Config
