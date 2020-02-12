package kr.ac.kaist.ires.phase

import java.io.File
import kr.ac.kaist.ires._
import kr.ac.kaist.ires.generator._
import kr.ac.kaist.ires.spec._
import kr.ac.kaist.ires.util.Useful._

// PreProcess phase
case object PreProcess extends PhaseObj[Unit, PreProcessConfig, Unit] {

  val name: String = "preprocess"
  val help: String = "copy AlgoCompiler file to model."

  def apply(
    non: Unit,
    iresConfig: IRESConfig,
    config: PreProcessConfig
  ): Unit = {
    deleteFile(s"$MODEL_DIR/package.scala")
    PreGenerator()
  }

  def defaultConfig: PreProcessConfig = PreProcessConfig()
  val options: List[PhaseOption[PreProcessConfig]] = List()
}

// PreProcess phase config
case class PreProcessConfig() extends Config
