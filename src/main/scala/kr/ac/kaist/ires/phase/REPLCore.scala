package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.core._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }

// REPLCore phase
case object REPLCore extends PhaseObj[State, REPLCoreConfig, Unit] {
  val name = "repl-core"
  val help = "REPL for Core syntax."

  def apply(
    st: State,
    iresConfig: IRESConfig,
    config: REPLCoreConfig
  ): Unit = REPL.run(st, config.detail)

  def defaultConfig: REPLCoreConfig = REPLCoreConfig()
  val options: List[PhaseOption[REPLCoreConfig]] = List(
    ("detail", BoolOption(c => c.detail = true),
      "Show detailed status of the current state.")
  )
}

// REPLCore phase config
case class REPLCoreConfig(
  var detail: Boolean = false
) extends Config
