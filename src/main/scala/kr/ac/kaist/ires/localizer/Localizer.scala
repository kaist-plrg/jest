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

class Localizer(formula: Stat => Double) {
  def getSortedScore[T](m: Map[T, Stat]): ListMap[T, Double] =
    ListMap(m.view.mapValues(_.getScore(formula)).toSeq.sortWith(_._2 > _._2): _*)

  // instruction localizer
  val instCounter: Map[Int, Stat] =
    insts.map(inst => (inst.uid, Stat())).toMap
  lazy val instScores: ListMap[Int, Double] = getSortedScore(instCounter)
  def updateInst(covered: Set[Int], failed: Boolean) =
    instCounter.foreach {
      case (uid, stat) =>
        stat.update(covered contains uid, failed)
    }
  private def dumpInst(filepath: String): Unit = {
    val instContent = instScores.zipWithIndex.map {
      case ((uid, score), rank) => {
        val algoName = instToAlgo(uid).name
        val inst = beautify(insts(uid), detail = false)
        f"$rank%6d $score%6.2f [$uid] $inst @ $algoName"
      }
    }.mkString(LINE_SEP)
    dumpFile(instContent, filepath)
  }

  // algorithm localizer
  val algoCounter: Map[String, Stat] =
    Algorithm.all.map(algo => (algo.name, Stat())).toMap
  lazy val algoScores: ListMap[String, Double] = getSortedScore(algoCounter)
  def updateAlgo(covered: Set[String], failed: Boolean) =
    algoCounter.foreach {
      case (algoName, stat) =>
        stat.update(covered contains algoName, failed)
    }
  private def dumpAlgo(filepath: String): Unit = {
    val algoContent = algoScores.zipWithIndex.map {
      case ((algoName, score), rank) =>
        f"$rank%8d $score%8.4f $algoName"
    }.mkString(LINE_SEP)
    dumpFile(algoContent, filepath)
  }

  // method-level aggregation
  private def dumpAlgoAggregated(filepath: String): Unit = {
    var agAlgoScores: ListMap[String, Double] = ListMap()
    instScores.foreach {
      case (uid, score) => {
        val algoName = instToAlgo(uid).name
        if (!agAlgoScores.keySet.contains(algoName))
          agAlgoScores += algoName -> score
      }
    }

    val agAlgoContent = agAlgoScores.zipWithIndex.map {
      case ((algoName, score), rank) =>
        f"$rank%8d $score%8.4f $algoName"
    }.mkString(LINE_SEP)
    dumpFile(agAlgoContent, filepath)
  }

  def dump(dir: String) = {
    mkdir(dir)
    dumpInst(s"$dir/inst")
    dumpAlgo(s"$dir/algo")
    dumpAlgoAggregated(s"$dir/algo-aggregated")
  }
}

object Localizer {
  def apply(
    scriptDir: String,
    failedScripts: Set[String],
    formula: Stat => Double
  ): Localizer = {
    val localizer = new Localizer(formula)
    val toJsonExt = changeExt("js", "json")
    // update total structural element from scriptDir, failed
    for {
      file <- walkTree(scriptDir)
      name = file.getName
      if jsFilter(name)
      filename = file.toString
      parseResult = parse(Script(Nil), fileReader(filename)) if parseResult.successful
      script = parseResult.get
      failed = failedScripts contains name
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

      localizer.updateInst(instCovered, failed)
      localizer.updateAlgo(algoCovered, failed)
    }
    localizer
  }
}