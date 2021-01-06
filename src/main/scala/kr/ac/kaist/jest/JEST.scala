package kr.ac.kaist.jest

import kr.ac.kaist.jest.phase._
import kr.ac.kaist.jest.error._
import kr.ac.kaist.jest.util._
import kr.ac.kaist.jest.model.Algorithm

object JEST {
  ////////////////////////////////////////////////////////////////////////////////
  // Main entry point
  ////////////////////////////////////////////////////////////////////////////////
  def main(tokens: Array[String]): Unit = try tokens.toList match {
    case str :: args => cmdMap.get(str) match {
      case Some(cmd) => cmd(args)
      case None => throw NoCmdError(str)
    }
    case Nil => throw NoInputError
  } catch {
    // ArgParseError
    case ex: ArgParseError =>
      Console.err.println(ex.getMessage)
    // JESTError: print the error message.
    case ex: JESTError =>
      Console.err.println("[ERROR]: " + ex.getMessage)
      if (DEBUG) Console.err.println(ex.getStackTrace.mkString(LINE_SEP))
    // Unexpected: print the stack trace.
    case ex: Throwable =>
      Console.err.println("* Unexpected error occurred.")
      Console.err.println("[ERROR]: " + ex.toString)
      Console.err.println(ex.getStackTrace.mkString(LINE_SEP))
  }

  def apply[Result](
    command: CommandObj[Result],
    runner: JESTConfig => Result,
    config: JESTConfig
  ): Result = {
    // set the start time.
    val startTime = System.currentTimeMillis

    // initialize Algorithm instructions unique ID
    Algorithm.all

    // execute the command.
    val result: Result = runner(config)

    // duration
    val duration = System.currentTimeMillis - startTime

    // display the result.
    command.display(result)

    // display the time.
    if (config.time) {
      val name = config.command.name
      println(s"The command '$name' took $duration ms.")
    }

    // return result
    result
  }

  // commands
  val commands: List[Command] = List(
    CmdHelp,
    CmdSample,
    CmdGenerate,
    CmdInject,
    CmdCheck,
    CmdLocalize,
    CmdRun
  )
  val cmdMap = commands.foldLeft[Map[String, Command]](Map()) {
    case (map, cmd) => map + (cmd.name -> cmd)
  }

  // phases
  var phases: List[Phase] = List(
    Help,
    Sample,
    Generate,
    Inject,
    Check,
    Localize
  )

  // global options
  val options: List[PhaseOption[JESTConfig]] = List(
    ("time", BoolOption(c => c.time = true),
      "display duration time."),
    ("bugfix", BoolOption(_ => BUG_FIX = true),
      "use bug-fixed semantics."),
    ("detail", BoolOption(c => DETAIL = true),
      "print intermediate process.")
  )

  // indentation
  private val INDENT = 20

  // print help message.
  val help: String = {
    val s: StringBuilder = new StringBuilder
    s.append("Invoked as script: jest args").append(LINE_SEP)
      .append("Invoked by java: java ... kr.ac.kaist.jest.JEST args").append(LINE_SEP)
      .append(LINE_SEP)
      .append("* command list:").append(LINE_SEP)
      .append("    Each command consists of following phases.").append(LINE_SEP)
      .append("    format: {command} {phase} [>> {phase}]*").append(LINE_SEP).append(LINE_SEP)
    commands foreach (cmd => {
      s.append(s"    %-${INDENT}s".format(cmd.name))
        .append(cmd.toString.replace(LINE_SEP, LINE_SEP + "    " + " " * INDENT))
        .append(LINE_SEP)
    })
    s.append(LINE_SEP)
      .append("* phase list:").append(LINE_SEP)
      .append("    Each phase has following options.").append(LINE_SEP)
      .append("    format: {phase} [-{phase}:{option}[={input}]]*").append(LINE_SEP).append(LINE_SEP)
    phases foreach (phase => {
      s.append(s"    %-${INDENT}s".format(phase.name))
      Useful.indentation(s, phase.help, INDENT + 4)
      s.append(LINE_SEP)
        .append(LINE_SEP)
      phase.getOptDescs foreach {
        case (name, desc) =>
          s.append(s"%${INDENT + 4}s".format("") + s"If $name is given, $desc").append(LINE_SEP)
      }
      s.append(LINE_SEP)
    })
    s.append("* global option:").append(LINE_SEP).append(LINE_SEP)
    options.foreach {
      case (opt, kind, desc) =>
        val name = s"-${opt}${kind.postfix}"
        s.append(s"    If $name is given, $desc").append(LINE_SEP)
    }
    s.toString
  }
}

case class JESTConfig(
    var command: Command,
    var fileNames: List[String] = Nil,
    var time: Boolean = false
) extends Config
