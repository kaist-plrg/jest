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
import kr.ac.kaist.ires.checker._
import spray.json._

// localize phase
case object Localize extends PhaseObj[Unit, LocalizeConfig, Unit] with DefaultJsonProtocol {
  val name = "localize"
  val help = "Localize JavaScript files."

  mkdir(LOCALIZED_DIR)

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: LocalizeConfig
  ): Unit = {
    val failedPath = config.failedPath
    val scriptsDir = config.scriptsDir
    val errorsDir = config.errorsDir
    for {
      failedFile <- walkTree(failedPath)
      name = failedFile.getName
      filename = failedFile.toString if jsonFilter(filename)
    } {
      val engine = removedExt(name)
      val localizedDir = s"${LOCALIZED_DIR}/$engine"
      mkdir(localizedDir)
      val m = readJson[Map[String, Set[String]]](filename)
      m.zipWithIndex.foreach {
        case ((failedDesc, failedSet), i) => {
          val localizer = Localizer(scriptsDir, errorsDir, engine, failedDesc, failedSet, config.formula)
          localizer.dump(s"$localizedDir/$i")
        }
      }
    }
  }

  def defaultConfig: LocalizeConfig = LocalizeConfig()
  val options: List[PhaseOption[LocalizeConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process."),
    ("load", StrOption((c, str) => c.scriptsDir = str),
      "path to generated scripts"),
    ("load-errors", StrOption((c, str) => c.errorsDir = str),
      "path to error scripts"),
    ("failed", StrOption((c, str) => c.failedPath = str),
      "path to failed script lists"),
    ("formula", StrOption((c, str) => c.formula = Formula.nameMap.getOrElse(str, Tarantula)),
      "set the formula for SBFL (default: Tarantula).")
  )
}

// Localize phase config
case class LocalizeConfig(
    var debug: Boolean = false,
    var failedPath: String = s"$DIFF_TEST_DIR/failed",
    var scriptsDir: String = s"$GENERATED_DIR",
    var errorsDir: String = s"$ERRORS_DIR",
    var formula: Formula = Tarantula
) extends Config
