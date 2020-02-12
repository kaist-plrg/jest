package kr.ac.kaist.ires.phase

import scala.util.{ Try, Success }
import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.model.Model
import kr.ac.kaist.ires.util._

// IRLoad phase
case object IRLoad extends PhaseObj[Program, IRLoadConfig, State] {
  val name: String = "load-ir"
  val help: String = "Load IR program into IR State"

  def apply(
    pgm: Program,
    iresConfig: IRESConfig,
    config: IRLoadConfig
  ): State = Model.initState.copy(context = Model.initState.context.copy(insts = pgm.insts))

  def defaultConfig: IRLoadConfig = IRLoadConfig()
  val options: List[PhaseOption[IRLoadConfig]] = List()
}

// IRLoad phase config
case class IRLoadConfig() extends Config
