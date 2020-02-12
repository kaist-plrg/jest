package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.algorithm._
import kr.ac.kaist.ires.util.BoolOption
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }

// REPLAlgo phase
case object REPLAlgo extends PhaseObj[Unit, REPLAlgoConfig, Unit] {
  val name = "repl-algo"
  val help = "REPL for algorithms."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: REPLAlgoConfig
  ): Unit = REPL.run(config.onlyFailed)

  def defaultConfig: REPLAlgoConfig = REPLAlgoConfig()
  val options: List[PhaseOption[REPLAlgoConfig]] = List(
    ("only-failed", BoolOption(c => c.onlyFailed = true),
      "REPL with only failed steps.")
  )
}

// REPLAlgo phase config
case class REPLAlgoConfig(
  var onlyFailed: Boolean = false
) extends Config
