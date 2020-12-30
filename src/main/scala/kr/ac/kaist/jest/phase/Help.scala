package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest.{ JEST, JESTConfig }

// Help phase
case object Help extends PhaseObj[Unit, HelpConfig, Unit] {
  val name = "help"
  val help = ""

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: HelpConfig
  ): Unit = println(JEST.help)
  def defaultConfig: HelpConfig = HelpConfig()
  val options: List[PhaseOption[HelpConfig]] = Nil
}

case class HelpConfig() extends Config
