package kr.ac.kaist.jest

import kr.ac.kaist.jest.error.NoMode
import kr.ac.kaist.jest.model.Script
import kr.ac.kaist.jest.phase._
import kr.ac.kaist.jest.util.ArgParser

sealed trait Command {
  val name: String
  def apply(args: List[String]): Any
}

class CommandObj[Result](
    override val name: String,
    pList: PhaseList[Result]
) extends Command {
  def apply(args: List[String]): Result = {
    val jestConfig = JESTConfig(this)
    val parser = new ArgParser(this, jestConfig)
    val runner = pList.getRunner(parser)
    parser(args)
    JEST(this, runner(_), jestConfig)
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

// generate
case object CmdGenerate extends CommandObj("generate", CmdBase >> Generate)

// sample
case object CmdSample extends CommandObj("sample", CmdBase >> Sample)

// inject
case object CmdInject extends CommandObj("inject", CmdBase >> Inject)

// mutate
case object CmdMutate extends CommandObj("mutate", CmdParse >> Mutate)

// check
case object CmdCheck extends CommandObj("check", CmdBase >> Check)

// inject-check
case object CmdInjectCheck extends CommandObj("inject-check", CmdBase >> Inject >> Check)

// localize
case object CmdLocalize extends CommandObj("localize", CmdBase >> Localize)

// find-bug
case object CmdFindBug extends CommandObj("find-bug", CmdBase >> Inject >> Check >> Localize)

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
