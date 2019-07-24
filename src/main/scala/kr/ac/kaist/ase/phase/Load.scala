package kr.ac.kaist.ase.phase

import kr.ac.kaist.ase.{ LINE_SEP, ASEConfig }
import kr.ac.kaist.ase.model.{ Parser => JSParser, _ }
import kr.ac.kaist.ase.core._
import kr.ac.kaist.ase.util.Useful._
import scala.io.Source

// Load phase
case object Load extends PhaseObj[Script, LoadConfig, State] {
  val name = "load"
  val help = "read script object and using global, convert to State object."

  def apply(
    script: Script,
    aseConfig: ASEConfig,
    config: LoadConfig
  ): State = Model.initState.copy(
    insts = List(Parser.parseInst("""{
      app __x0__ = (RunJobs)
      return __x0__
    }""")),
    globals = Model.initState.globals + (Id("script") -> ASTVal(script))
  )

  def defaultConfig: LoadConfig = LoadConfig()
  val options: List[PhaseOption[LoadConfig]] = List()
}

// Parse phase config
case class LoadConfig() extends Config
