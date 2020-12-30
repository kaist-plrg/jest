package kr.ac.kaist.jest.phase

import scala.util.{ Try, Success }
import kr.ac.kaist.jest.JESTConfig
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.model.Model
import kr.ac.kaist.jest.util._

// IRLoad phase
case object IRLoad extends PhaseObj[Program, IRLoadConfig, State] {
  val name: String = "load-ir"
  val help: String = "Load IR program into IR State"

  def apply(
    pgm: Program,
    jestConfig: JESTConfig,
    config: IRLoadConfig
  ): State = Model.initState.copy(context = Model.initState.context.copy(insts = pgm.insts))

  def defaultConfig: IRLoadConfig = IRLoadConfig()
  val options: List[PhaseOption[IRLoadConfig]] = List()
}

// IRLoad phase config
case class IRLoadConfig() extends Config
