package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.core._
import kr.ac.kaist.ires.util._

// EvalCore phase
case object EvalCore extends PhaseObj[State, EvalCoreConfig, State] {
  val name: String = "eval-core"
  val help: String = "evaluates JavaScript source files to Core."

  def apply(
    initialSt: State,
    iresConfig: IRESConfig,
    config: EvalCoreConfig
  ): State = (new Interp())(initialSt)

  def defaultConfig: EvalCoreConfig = EvalCoreConfig()
  val options: List[PhaseOption[EvalCoreConfig]] = List()
}

// EvalCore phase config
case class EvalCoreConfig() extends Config
