package kr.ac.kaist.jest.phase

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.sampler._
import kr.ac.kaist.jest.util.BoolOption
import kr.ac.kaist.jest.util.Useful._

// sample phase
case object Sample extends PhaseObj[Unit, SampleConfig, Unit] {
  val name = "sample"
  val help = "samples JavaScript files."

  def apply(
    unit: Unit,
    jestConfig: JESTConfig,
    config: SampleConfig
  ): Unit = {
    println("##############################")
    println("#       Seed Synthesis       #")
    println("##############################")
    val samples = NRSampler.getSample ++
      ManualSampler.getSample ++
      BuiltinSampler.getSample
    val len = samples.length
    println(s"$len seed programs are synthesized.")
    println("Calculating syntax coverage...")
    val tracer = RHSTracer(samples)
    println(tracer.summary)
    tracer.dump(s"$GENERATE_DIR/syntax")
    mkdir(SEED_DIR)
    for ((script, k) <- samples.zipWithIndex) {
      dumpFile(script, s"$SEED_DIR/$k.js")
    }
  }

  def defaultConfig: SampleConfig = SampleConfig()
  val options: List[PhaseOption[SampleConfig]] = Nil
}

// Sample phase config
case class SampleConfig() extends Config
