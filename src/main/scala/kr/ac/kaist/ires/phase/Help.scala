package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.{ IRES, IRESConfig }

// Help phase
case object Help extends PhaseObj[Unit, HelpConfig, Unit] {
  val name = "help"
  val help = ""

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: HelpConfig
  ): Unit = println(IRES.help)
  def defaultConfig: HelpConfig = HelpConfig()
  val options: List[PhaseOption[HelpConfig]] = Nil
}

case class HelpConfig() extends Config
