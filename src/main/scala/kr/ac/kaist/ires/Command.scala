package kr.ac.kaist.ires

import kr.ac.kaist.ires.error.NoMode
import kr.ac.kaist.ires.model.Script
import kr.ac.kaist.ires.phase._
import kr.ac.kaist.ires.util.ArgParser

sealed trait Command {
  val name: String
  def apply(args: List[String]): Any
}

class CommandObj[Result](
    override val name: String,
    pList: PhaseList[Result]
) extends Command {
  def apply(args: List[String]): Result = {
    val iresConfig = IRESConfig(this)
    val parser = new ArgParser(this, iresConfig)
    val runner = pList.getRunner(parser)
    parser(args)
    IRES(this, runner(_), iresConfig)
  }

  def display(res: Result): Unit = ()

  override def toString: String = pList.toString

  def >>[C <: Config, R](phase: PhaseObj[Result, C, R]): PhaseList[R] = pList >> phase
}

// base command
case object CmdBase extends CommandObj("", PhaseNil)

// filter
case object CmdFilterMeta extends CommandObj("filter-meta", CmdBase >> FilterMeta)

// parse
case object CmdParse extends CommandObj("parse", CmdBase >> Parse) {
  override def display(script: Script): Unit = println(script)
}

// load
case object CmdLoad extends CommandObj("load", CmdParse >> Load)

// eval
case object CmdEval extends CommandObj("eval", CmdLoad >> EvalCore) {
  override def display(st: core.State): Unit = println(core.beautify(st))
}

// repl
case object CmdREPL extends CommandObj("repl", CmdLoad >> REPLCore)

// parse-core
case object CmdParseCore extends CommandObj("parse-core", CmdBase >> ParseCore) {
  override def display(pgm: core.Program): Unit = println(core.beautify(pgm))
}

// load-core
case object CmdLoadCore extends CommandObj("load-core", CmdParseCore >> LoadCore) {
  override def display(st: core.State): Unit = println(core.beautify(st))
}

// eval-core
case object CmdEvalCore extends CommandObj("eval-core", CmdLoadCore >> EvalCore) {
  override def display(st: core.State): Unit = println(core.beautify(st))
}

// repl-core
case object CmdREPLCore extends CommandObj("repl-core", CmdLoadCore >> REPLCore)

// help
case object CmdHelp extends CommandObj("help", CmdBase >> Help)
