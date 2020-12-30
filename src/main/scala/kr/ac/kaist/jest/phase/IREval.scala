package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest.JESTConfig
import kr.ac.kaist.jest.coverage.Visited
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.util._

// IREval phase
case object IREval extends PhaseObj[State, IREvalConfig, State] {
  val name: String = "eval-ir"
  val help: String = "evaluates JavaScript source files to IR."

  def apply(
    initialSt: State,
    jestConfig: JESTConfig,
    config: IREvalConfig
  ): State = {
    val st = (new Interp(config.debugir, config.timeout, Visited.global))(initialSt)
    if (config.state) println(beautify(st))
    st
  }

  def defaultConfig: IREvalConfig = IREvalConfig()
  val options: List[PhaseOption[IREvalConfig]] = List(
    ("debug-ir", BoolOption(c => c.debugir = true),
      "print each step of IR."),
    ("timeout", NumOption((c, i) => c.timeout = if (i == 0) None else Some(i)),
      "set timeout of interpreter(second), 0 for unlimited."),
    ("state", BoolOption(c => c.state = true),
      "show the final state after the evaluation."),
  )
}

// IREval phase config
case class IREvalConfig(
    var debugir: Boolean = false,
    var timeout: Option[Long] = Some(10),
    var state: Boolean = false
) extends Config
