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
case object CmdEval extends CommandObj("eval", CmdLoad >> IREval)

// repl
case object CmdREPL extends CommandObj("repl", CmdLoad >> IRREPL)

// parse-ir
case object CmdIRParse extends CommandObj("parse-ir", CmdBase >> IRParse) {
  override def display(pgm: ir.Program): Unit = println(ir.beautify(pgm))
}

// load-ir
case object CmdIRLoad extends CommandObj("load-ir", CmdIRParse >> IRLoad) {
  override def display(st: ir.State): Unit = println(ir.beautify(st))
}

// eval-ir
case object CmdIREval extends CommandObj("eval-ir", CmdIRLoad >> IREval) {
  override def display(st: ir.State): Unit = println(ir.beautify(st))
}

// repl-ir
case object CmdIRREPL extends CommandObj("repl-ir", CmdIRLoad >> IRREPL)

// help
case object CmdHelp extends CommandObj("help", CmdBase >> Help)
