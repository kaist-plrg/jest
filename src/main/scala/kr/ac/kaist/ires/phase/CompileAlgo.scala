package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.algorithm._
import kr.ac.kaist.ires.core
import kr.ac.kaist.ires.model.AlgoCompiler
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.{ LINE_SEP, IRESConfig }
import scala.io.Source

// CompileAlgo phase
case object CompileAlgo extends PhaseObj[Algorithm, CompileAlgoConfig, core.Func] {
  val name = "compile-algo"
  val help = "Compiles algorithm files."

  def apply(
    algo: Algorithm,
    iresConfig: IRESConfig,
    config: CompileAlgoConfig
  ): core.Func = {
    val name = getScalaName(removedExt(getSimpleFilename(getFirstFilename(iresConfig, "parse"))))
    val (func, failed) = AlgoCompiler(name, algo).result
    failed.toSeq.sortBy(_._1) foreach {
      case (k, tokens) => println(s"[FailedLine]:$k: ${Token.getString(tokens)}")
    }
    func
  }

  def defaultConfig: CompileAlgoConfig = CompileAlgoConfig()
  val options: List[PhaseOption[CompileAlgoConfig]] = List()
}

// CompileAlgo phase config
case class CompileAlgoConfig() extends Config
