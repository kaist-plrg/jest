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

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: LocalizeConfig
  ): Unit = {
    val failedPath = config.failedPath
    val scriptsDir = config.scriptsDir
    val errorsDir = config.errorsDir
    val localizedDir = config.localizedDir

    mkdir(localizedDir)

    for {
      failedFile <- walkTree(failedPath)
      name = failedFile.getName
      filename = failedFile.toString if jsonFilter(filename)
    } {
      val engine = removedExt(name)
      val dir = s"$localizedDir/$engine"
      mkdir(dir)

      val answerMap: Option[Map[String, String]] = config.answerDir match {
        case Some(answerDir) =>
          Some(readJson[Map[String, String]](s"$answerDir/$name"))
        case None => None
      }

      val m = readJson[Map[String, Set[String]]](filename)
      m.zipWithIndex.foreach {
        case ((failedDesc, failedSet), i) => {
          val localizer = Localizer(scriptsDir, errorsDir, engine, failedDesc, failedSet, config.formula, config.mutate)
          localizer.dump(s"$dir/$i")

          // create summary
          var summary: String = {
            s"mutate : ${config.mutate}" + LINE_SEP +
              s"formula : ${config.formula.name}" + LINE_SEP +
              s"fail description : $failedDesc" + LINE_SEP
          }
          // if answerMap exists, then save result
          answerMap match {
            case Some(am) => am.get(failedDesc) match {
              case Some(answerAlgo) => {
                val algoRank = localizer.getAlgoRank(answerAlgo)
                val agAlgoRank = localizer.getAgAlgoRank(answerAlgo)
                println(answerAlgo)
                summary += {
                  s"answer : $answerAlgo" + LINE_SEP +
                    s"algo rank : $algoRank" + LINE_SEP +
                    s"aggregated algo rank : $agAlgoRank" + LINE_SEP
                }
              }
              case None => // do nothing
            }
            case None => // do nothing
          }

          dumpFile(summary, s"$dir/$i/summary")
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
      "set the formula for SBFL (default: Tarantula)."),
    ("mutate", BoolOption(c => c.mutate = false),
      "apply mutation in localizer"),
    ("localized", StrOption((c, str) => c.localizedDir = str),
      "path to localization result directory"),
    ("answer", StrOption((c, str) => c.answerDir = Some(str)),
      "path to answer directory")
  )
}

// Localize phase config
case class LocalizeConfig(
    var debug: Boolean = false,
    var failedPath: String = s"$DIFF_TEST_DIR/failed",
    var scriptsDir: String = s"$GENERATED_DIR",
    var errorsDir: String = s"$ERRORS_DIR",
    var localizedDir: String = s"$LOCALIZED_DIR",
    var answerDir: Option[String] = None,
    var formula: Formula = Tarantula,
    var mutate: Boolean = false
) extends Config
