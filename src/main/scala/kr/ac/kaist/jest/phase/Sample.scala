package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.sampler._
import kr.ac.kaist.jest.util.BoolOption
import kr.ac.kaist.jest.util.Useful._

// sample phase
case object Sample extends PhaseObj[Unit, SampleConfig, Unit] {
  val name = "sample"
  val help = "synthesizes seed JavaScript programs."

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: SampleConfig
  ): Unit = {
    println("--------------- sample -----------------")
    println("Synthesizing seed...")
    val samples = NRSampler.getSample ++
      ManualSampler.getSample ++
      BuiltinSampler.getSample
    val len = samples.length
    println(s"$len seed programs are synthesized.")
    mkdir(SEED_DIR)
    for ((script, k) <- samples.zipWithIndex) {
      dumpFile(script, s"$SEED_DIR/$k.js")
    }
    println(s"Dumped seed programs to $SEED_DIR.")
    val tracer = RHSTracer(samples)
    println(tracer.summary)
    tracer.dump(s"$GENERATE_DIR/syntax")
  }

  def defaultConfig: SampleConfig = SampleConfig()
  val options: List[PhaseOption[SampleConfig]] = Nil
}

// Sample phase config
case class SampleConfig() extends Config
