package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import kr.ac.kaist.ires.model.{ Parser => JSParser, _ }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util.Useful._
import scala.io.Source

// Load phase
case object Load extends PhaseObj[Script, LoadConfig, State] {
  val name = "load"
  val help = "read script object and using global, convert to State object."

  def apply(
    script: Script,
    iresConfig: IRESConfig,
    config: LoadConfig
  ): State = Model.initState.copy(
    context = Model.initState.context.copy(
      insts = List(Parser.parseInst("app result = (RunJobs)"))
    ),
    globals = Model.initState.globals + (Id("script") -> ASTVal(script)) + (Id("__filename__") -> Str(iresConfig.fileNames.lift(0).getOrElse("unknown")))
  )

  def defaultConfig: LoadConfig = LoadConfig()
  val options: List[PhaseOption[LoadConfig]] = List()
}

// Parse phase config
case class LoadConfig() extends Config
