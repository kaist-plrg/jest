package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.util.ArgParser

abstract class Phase {
  val name: String
  val help: String
  def getOptShapes: List[String]
  def getOptDescs: List[(String, String)]
}
abstract class PhaseObj[Input, PhaseConfig <: Config, Output] extends Phase {
  val name: String
  val help: String
  def apply(
    in: Input,
    iresConfig: IRESConfig,
    config: PhaseConfig = defaultConfig
  ): Output
  def defaultConfig: PhaseConfig
  val options: List[PhaseOption[PhaseConfig]]

  def getRunner(
    parser: ArgParser
  ): (Input, IRESConfig) => Output = {
    val config = defaultConfig
    parser.addRule(config, name, options)
    (in, iresConfig) => apply(in, iresConfig, config)
  }

  def getOptShapes: List[String] = options.map {
    case (opt, kind, _) => s"-$name:${opt}${kind.postfix}"
  }
  def getOptDescs: List[(String, String)] = options.map {
    case (opt, kind, desc) => (s"-$name:${opt}${kind.postfix}", desc)
  }
}

trait Config
