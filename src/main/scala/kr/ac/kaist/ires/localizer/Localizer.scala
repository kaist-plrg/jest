package kr.ac.kaist.ires.localizer

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.generator.Generator
import kr.ac.kaist.ires.ir.beautify
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.model.{ Algorithm, Script }
import kr.ac.kaist.ires.model.Parser._
import kr.ac.kaist.ires.util._
import kr.ac.kaist.ires.util.Useful._
import spray.json._
import scala.collection.immutable.ListMap
import scala.math.Ordering.Double.IeeeOrdering

object Localizer {
  def apply(
    scriptDir: String,
    failedPath: String,
    formula: Stat => Double
  ): Unit = {
    def getSortedScore[T](m: Map[T, Stat]): ListMap[T, Double] =
      ListMap(m.view.mapValues(_.getScore(formula)).toSeq.sortWith(_._2 > _._2): _*)

    // generate structural element list(algo)
    val algoCounter: Map[String, Stat] =
      Algorithm.all.map(algo => (algo.name, Stat())).toMap
    // generate structural element list(inst)
    val instCounter: Map[Int, Stat] =
      insts.map(inst => (inst.uid, Stat())).toMap

    val failedScriptNames: Set[String] =
      if (exists(failedPath)) readFile(failedPath).split(LINE_SEP).toSet
      else Set()

    val toJsonExt = changeExt("js", "json")

    // update total structural element from scriptDir, failed
    for {
      file <- walkTree(scriptDir)
      name = file.getName
      if jsFilter(name)
      filename = file.toString
      parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
      script = parseResult.get
      failed = failedScriptNames contains name
    } {
      // check if touched exist
      val touchedInstCache = s"$TOUCHED_DIR/inst/${toJsonExt(name)}"
      val touchedAlgoCache = s"$TOUCHED_DIR/algo/${toJsonExt(name)}"
      val cached = exists(touchedInstCache) && exists(touchedAlgoCache)

      var instCovered = Set[Int]()
      var algoCovered = Set[String]()

      if (cached) {
        // read from cache
        instCovered = readJson[Set[Int]](touchedInstCache)
        algoCovered = readJson[Set[String]](touchedAlgoCache)
      } else Generator.getVisited(script) match {
        case Left(visited) => {
          instCovered = visited.instCovered
          algoCovered = visited.touchedAlgos
          // dump
          dumpJson(visited.instCovered, touchedInstCache)
          dumpJson(visited.touchedAlgos, touchedAlgoCache)
        }
        // TODO : handle exception?
        case _ =>
      }

      // iter inst
      instCounter.foreach {
        case (uid, stat) =>
          stat.update(instCovered contains uid, failed)
      }
      // iter algo
      algoCounter.foreach {
        case (algoName, stat) =>
          stat.update(algoCovered contains algoName, failed)
      }
    }

    // sort counter by score
    val instScores: ListMap[Int, Double] = getSortedScore(instCounter)
    val algoScores: ListMap[String, Double] = getSortedScore(algoCounter)

    // dump
    val instContent =
      instScores.zipWithIndex.map {
        case ((uid, score), rank) => {
          val algoName = instToAlgo(uid).name
          val inst = beautify(insts(uid), detail = false)
          f"$rank%6d $score%6.2f [$uid] $inst @ $algoName"
        }
      }.mkString(LINE_SEP)
    dumpFile(instContent, s"$DIFF_TEST_DIR/localized/inst")

    val algoContent =
      algoScores.zipWithIndex.map {
        case ((algoName, score), rank) => {
          f"$rank%6d $score%6.2f $algoName"
        }
      }.mkString(LINE_SEP)
    dumpFile(algoContent, s"$DIFF_TEST_DIR/localized/algo")
  }
}