package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }

// IRREPL phase
case object IRREPL extends PhaseObj[State, IRREPLConfig, Unit] {
  val name = "repl-ir"
  val help = "REPL for IR syntax."

  def apply(
    st: State,
    iresConfig: IRESConfig,
    config: IRREPLConfig
  ): Unit = REPL.run(st, config.detail)

  def defaultConfig: IRREPLConfig = IRREPLConfig()
  val options: List[PhaseOption[IRREPLConfig]] = List(
    ("detail", BoolOption(c => c.detail = true),
      "Show detailed status of the current state.")
  )
}

// IRREPL phase config
case class IRREPLConfig(
    var detail: Boolean = false
) extends Config
