package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest.JESTConfig
import kr.ac.kaist.jest.coverage.Visited
import kr.ac.kaist.jest.error._
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.util._

// Eval phase
case object Eval extends PhaseObj[State, EvalConfig, Tag] {
  val name: String = "eval"
  val help: String = "evaluates a given JavaScript program."

  def apply(
    initialSt: State,
    jestConfig: JESTConfig,
    config: EvalConfig
  ): Tag = {
    val interp = new Interp(config.debug, config.timeout, Visited.global)
    val (st, uidOpt) = try {
      val st = interp(initialSt)
      if (config.state) println(beautify(st))
      (st, None)
    } catch {
      case Timeout => (initialSt, Some(-1))
      case e: IRError => (initialSt, Some(interp.recentInst.get.uid))
    }
    interp.getTag(st, uidOpt)
  }

  def defaultConfig: EvalConfig = EvalConfig()
  val options: List[PhaseOption[EvalConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print each step."),
    ("timeout", NumOption((c, i) => c.timeout = if (i == 0) None else Some(i)),
      "set timeout of interpreter(second), 0 for unlimited."),
    ("state", BoolOption(c => c.state = true),
      "show the final state after the evaluation."),
  )
}

// Eval phase config
case class EvalConfig(
    var debug: Boolean = false,
    var timeout: Option[Long] = Some(10),
    var state: Boolean = false
) extends Config
