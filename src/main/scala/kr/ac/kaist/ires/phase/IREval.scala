package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util._

// IREval phase
case object IREval extends PhaseObj[State, IREvalConfig, State] {
  val name: String = "eval-ir"
  val help: String = "evaluates JavaScript source files to IR."

  def apply(
    initialSt: State,
    iresConfig: IRESConfig,
    config: IREvalConfig
  ): State = (new Interp())(initialSt)

  def defaultConfig: IREvalConfig = IREvalConfig()
  val options: List[PhaseOption[IREvalConfig]] = List()
}

// IREval phase config
case class IREvalConfig() extends Config
