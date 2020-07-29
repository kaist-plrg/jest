package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.ir.beautify
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.model.{ Algorithm, Script }
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import spray.json._

// localize phase
case object Localize extends PhaseObj[Script, LocalizeConfig, Unit] with DefaultJsonProtocol {
  val name = "localize"
  val help = "Localize JavaScript files."

  def apply(
    script: Script,
    iresConfig: IRESConfig,
    config: LocalizeConfig
  ): Unit = {
    val counter = getCounter
    Generator.getVisited(script) match {
      case Left(visited) => visited.instCovered.toList.map {
        case uid => (uid, counter(uid))
      }.sortBy { case (k, c) => (c, k) }.foreach {
        case (uid, count) =>
          val algoName = instToAlgo(uid).name
          val inst = beautify(insts(uid), detail = false)
          println(f"$count%3d [$uid] $inst @ $algoName")
      }
      case _ =>
    }
  }

  val failedFile = s"$DIFF_TEST_DIR/failed"
  val countsFile = s"$DIFF_TEST_DIR/counts"
  def getCounter: Map[Int, Int] = if (exists(countsFile)) {
    val counts = readJson[List[Int]](countsFile)
    counts.zipWithIndex.map { case (c, i) => i -> c }.toMap
  } else {
    val failed: Set[String] =
      if (exists(failedFile)) readFile(failedFile).split(LINE_SEP).toSet
      else Set()

    var counter: Map[Int, Int] = Map()
    for {
      file <- walkTree(GENERATED_DIR)
      name = file.getName
      if jsFilter(name) && !(failed contains name)
      filename = file.toString
      parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
      script = parseResult.get
      uid <- Generator.getVisited(script) match {
        case Left(visited) => visited.instCovered
        case _ => Set()
      }
    } counter += uid -> (counter.getOrElse(uid, 0) + 1)

    val max = counter.keySet.max
    val counts = (0 until max).map(k => counter.getOrElse(k, 0)).toList

    dumpJson(counts, countsFile)

    counter
  }

  def defaultConfig: LocalizeConfig = LocalizeConfig()
  val options: List[PhaseOption[LocalizeConfig]] = List(
    ("debug", BoolOption(c => c.debug = true),
      "print intermediate process.")
  )
}

// Localize phase config
case class LocalizeConfig(
    var debug: Boolean = false
) extends Config
