package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.ir.beautify
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.model.{ Algorithm, Script }
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.localizer._
import spray.json._

// localize phase
case object Localize extends PhaseObj[Unit, LocalizeConfig, Unit] {
  val name = "localize"
  val help = "Localize JavaScript files."

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: LocalizeConfig
  ): Unit = {
    mkdir(s"$DIFF_TEST_DIR/localized")
    val scriptsDir = config.scriptsDir
    val failedPath = config.failedPath
    val fomula = Formula.Tarantula _
    Localizer(scriptsDir, failedPath, fomula)
  }

  def defaultConfig: LocalizeConfig = LocalizeConfig()
  val options: List[PhaseOption[LocalizeConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process."),
    ("load", StrOption((c, str) => c.scriptsDir = str),
      "path to generated scripts"),
    ("failed", StrOption((c, str) => c.failedPath = str),
      "path to failed script lists")
  )
}

// Localize phase config
case class LocalizeConfig(
    var debug: Boolean = false,
    var failedPath: String = s"$DIFF_TEST_DIR/failed",
    var scriptsDir: String = s"$GENERATED_DIR"
) extends Config
