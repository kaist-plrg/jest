package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.model._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.sampler.ValidityChecker
import scala.collection.immutable.{ Set => ScalaSet }

// generate phase
case object Generate extends PhaseObj[Unit, GenerateConfig, Unit] {
  val name = "generate"
  val help = "Generate JavaScript files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: GenerateConfig
  ): Unit = if (!config.archive) Generator.generate(
    debug = config.debug,
    maxIter = config.iter,
    loadDir = config.loadDir
  )
  else {
    // gather all .js file in archived directory
    var scripts: ScalaSet[String] = ScalaSet()
    for {
      file <- walkTree(ARCHIVED_DIR)
      name = file.getName if jsFilter(name)
      rawScript = readFile(file.toString)
      if !scripts.contains(rawScript) &&
        parse(Script(Nil), rawScript).successful &&
        ValidityChecker(rawScript)
    } scripts += rawScript

    // dump scripts
    mkdir(GENERATED_DIR)
    for ((script, k) <- scripts.toList.sortWith(_.length < _.length).zipWithIndex)
      dumpFile(script, s"${GENERATED_DIR}/$k.js")
  }

  def defaultConfig: GenerateConfig = GenerateConfig()
  val options: List[PhaseOption[GenerateConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process."),
    ("iter", NumOption((c, i) => c.iter = i),
      "maximum number of iterations for generations (default: 100)."),
    ("load", StrOption((c, str) => c.loadDir = Some(str)),
      "load existing scripts from the given directory"),
    ("archive", BoolOption(c => c.archive = true),
      "generate from archived directory")
  )
}

// Generate phase config
case class GenerateConfig(
    var debug: Boolean = false,
    var iter: Int = 100,
    var loadDir: Option[String] = None,
    var archive: Boolean = false
) extends Config
