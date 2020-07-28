package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.coverage._
import kr.ac.kaist.ires.model.Script
import kr.ac.kaist.ires.mutator.SimpleExprReplacer
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._

// mutate phase
case object Mutate extends PhaseObj[Script, MutateConfig, Script] {
  val name = "mutate"
  val help = "Mutate JavaScript files."

  def apply(
    script: Script,
    iresConfig: IRESConfig,
    config: MutateConfig
  ): Script = {
    implicit val debug = config.debug
    logln(s"given: $script")
    var iter = 0
    var mutated = script
    var set = Set(mutated)
    var keep = true
    val str = script.toString
    while (keep && iter < config.trial) {
      log(s"${iter}th iteration")
      (Generator.getVisited(mutated), config.target) match {
        case (Left(visited), Some(target)) if visited contains target =>
          logln(": PASS")
          keep = false
        case (Right(msg), _) => logln(s": $msg")
        case _ => logln(": FAIL")
      }
      logln(s"script: $mutated")

      do {
        mutated = Generator.mutate(str, SimpleExprReplacer)
      } while (set contains mutated)
      set += mutated
      iter += 1
    }
    mutated
  }

  def log(given: Any)(implicit debug: Boolean): Unit = if (debug) print(given)
  def logln(given: Any)(implicit debug: Boolean): Unit = if (debug) println(given)

  def defaultConfig: MutateConfig = MutateConfig()
  val targetPattern = "(\\d+),(#t|#f|[a-zA-z]+)".r
  val options: List[PhaseOption[MutateConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process."),
    ("trial", NumOption((c, i) => c.trial = i),
      "maximum number of trials for mutations (default: 100)."),
    ("target", StrOption((c, s) => s match {
      case targetPattern(uidStr, str) =>
        val uid = uidStr.toInt
        c.target = str match {
          case "#t" => Some(CondTarget(uid, true))
          case "#f" => Some(CondTarget(uid, false))
          case _ => Some(KindTarget(uid, str))
        }
      case _ =>
    }), "set the target branch.")
  )
}

// Mutate phase config
case class MutateConfig(
    var debug: Boolean = false,
    var target: Option[Target] = None,
    var trial: Int = 100
) extends Config
