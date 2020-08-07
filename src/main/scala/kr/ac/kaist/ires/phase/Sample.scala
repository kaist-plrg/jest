package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.sampler._
import kr.ac.kaist.ires.util.BoolOption
import kr.ac.kaist.ires.util.Useful._

// sample phase
case object Sample extends PhaseObj[Unit, SampleConfig, Unit] {
  val name = "sample"
  val help = "Sample JavaScript files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: SampleConfig
  ): Unit = {
    val samples = NRSampler.getSample ++ ManualSampler.getSample ++ BuiltinSampler.getSample ++ NRSampler.getEvalSample ++ NRSampler.getIndirectEvalSample
    for ((script, k) <- samples.zipWithIndex) {
      mkdir(SAMPLE_DIR)
      dumpFile(script, s"$SAMPLE_DIR/$k.js")
    }
  }

  def defaultConfig: SampleConfig = SampleConfig()
  val options: List[PhaseOption[SampleConfig]] = Nil
}

// Sample phase config
case class SampleConfig() extends Config
