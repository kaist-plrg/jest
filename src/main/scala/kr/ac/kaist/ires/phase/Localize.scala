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
import kr.ac.kaist.ires.localizer.AnswerProtocol._

// localize phase
case object Localize extends PhaseObj[Unit, LocalizeConfig, Unit] with DefaultJsonProtocol {
  val name = "localize"
  val help = "Localize JavaScript files."
  val FORMULAS: List[Formula] = List(ER1b, Jaccard, Ochiai)

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

      val answerMap: Option[Map[String, Set[Answer]]] = config.answerDir match {
        case Some(answerDir) =>
          Some(readJson[Map[String, Set[Answer]]](s"$answerDir/$name"))
        case None => None
      }

      val nf = getPrintWriter(s"$dir/summary")
      def add(any: Any): Unit = nf.print(s"$any\t")
      def newline: Unit = nf.println

      val headers: List[String] = List(
        "mutate",
        "formula",
        "fail description",
        "failed set",
        "answer",
        "id",
        "algo",
        "aggregated"
      )

      headers.foreach(add)
      newline

      val m = readJson[Map[String, Set[String]]](filename)
      m.zipWithIndex.foreach {
        case ((failedDesc, failedSet), i) => {
          val localizer = Localizer(scriptsDir, errorsDir, engine, failedDesc, failedSet, FORMULAS, config.mutate)
          localizer.dump(s"$dir/$i")

          // if answerMap exists, then save result
          answerMap match {
            case Some(am) => am.get(failedDesc) match {
              case Some(answers) => {
                answers.foreach(answer => {
                  val Answer(id, algo) = answer
                  val algoRanks = localizer.getAlgoRank.map(_(algo))
                  val agAlgoRanks = localizer.getAgAlgoRank.map(_(algo))
                  (localizer.formulas zip (algoRanks zip agAlgoRanks)).foreach {
                    case (formula, (algoRank, agAlgoRank)) =>
                      add(config.mutate)
                      add(formula.name)
                      add(failedDesc)
                      add(failedSet.toSeq.sorted.mkString(", "))
                      add(id)
                      add(algo)
                      add(algoRank)
                      add(agAlgoRank)
                      newline
                  }
                })
              }
              case None => localizer.formulas.foreach(formula => {
                add(config.mutate)
                add(formula.name)
                add(failedDesc)
                add(failedSet.toSeq.sorted.mkString(", "))
                newline
              })
            }
            case None => // do nothing
          }
        }
      }

      nf.close
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
