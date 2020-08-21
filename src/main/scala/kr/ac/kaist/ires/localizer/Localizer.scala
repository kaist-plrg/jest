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
import scala.math.Ordering.Double.IeeeOrdering

import kr.ac.kaist.ires.mutator._
import kr.ac.kaist.ires.sampler.ValidityChecker
import kr.ac.kaist.ires.injector._
import kr.ac.kaist.ires.checker._

case class Localizer(
    passSet: Set[String],
    instStats: Map[Int, Stat],
    algoStats: Map[String, Stat]
) {
  // update stats
  private val statOp: (Stat, Stat) => Stat = _ + _
  def updated(failed: Set[String]): Localizer = Localizer(
    passSet,
    merge(instStats, Localizer.getInstStats(passSet, failed), statOp),
    merge(algoStats, Localizer.getAlgoStats(passSet, failed), statOp)
  )

  // dump
  def dump(dir: String) = {
    mkdir(dir)
    dumpInstStat(s"$dir/inst-stat")
    dumpAlgoStat(s"$dir/algo-stat")
  }

  // get result
  def getResult(formula: Formula): LocalizeResult = LocalizeResult(
    getSortedScore(instStats, formula),
    getSortedScore(algoStats, formula)
  )

  // get sorted scores
  private def getSortedScore[T](
    m: Map[T, Stat],
    formula: Formula
  ): List[(T, Double)] = (m.toList.map {
    case (k, stat) => (k, stat.getScore(formula))
  }).sortWith(_._2 > _._2)

  // dump stat
  private def dumpInstStat(filepath: String): Unit = {
    val content = instStats.map {
      case (uid, stat) =>
        val inst = beautify(insts(uid), detail = false)
        val algoName = instToAlgo(uid).name
        s"[$uid] $inst : $stat @ $algoName"
    }.mkString(LINE_SEP)
    dumpFile(content, filepath)
  }

  private def dumpAlgoStat(filepath: String): Unit = {
    val content = algoStats.map {
      case (name, stat) => s"[$name]: $stat"
    }.mkString(LINE_SEP)
    dumpFile(content, filepath)
  }
}

object Localizer {
  def apply(failedSet: Set[String]): Localizer = {
    val passSet = totalSet -- failedSet
    Localizer(
      passSet,
      getStats(instMap, passSet, passSet, totalInsts),
      getStats(algoMap, passSet, passSet, totalAlgos)
    )
  }

  private lazy val totalSet = instMap.keySet
  private lazy val toJsonExt = changeExt("js", "json")
  private lazy val totalAlgos = Algorithm.all.map(_.name).toSet
  private lazy val totalInsts = insts.map(_.uid).toSet
  private lazy val (instMap, algoMap) = (for {
    file <- (walkTree(GENERATED_DIR) ++ walkTree(ERRORS_DIR))
    name = file.getName
    if jsFilter(name)
    filename = file.toString
    rawScript = readFile(filename)
    parseResult = parse(Script(Nil), rawScript) if parseResult.successful
    script = parseResult.get
  } yield {
    val touchedInstCache = s"$TOUCHED_DIR/inst/${toJsonExt(name)}"
    val touchedAlgoCache = s"$TOUCHED_DIR/algo/${toJsonExt(name)}"
    val cached = exists(touchedInstCache) && exists(touchedAlgoCache)

    val (instCovered, algoCovered) = if (cached) (
      readJson[Set[Int]](touchedInstCache),
      readJson[Set[String]](touchedAlgoCache)
    )
    else {
      val visited = Generator.getVisited(script) match {
        case Left(visited) => visited
        case _ => Generator.recentInterp.get.visited
      }
      (visited.instCovered, visited.touchedAlgos)
    }

    (name -> instCovered, name -> algoCovered)
  }).unzip match { case (i, a) => (i.toMap, a.toMap) }

  private def getInstStats(
    passSet: Set[String],
    targetSet: Set[String]
  ): Map[Int, Stat] = getStats(instMap, passSet, targetSet, totalInsts)

  private def getAlgoStats(
    passSet: Set[String],
    targetSet: Set[String]
  ): Map[String, Stat] = getStats(algoMap, passSet, targetSet, totalAlgos)

  private def getStats[T](
    map: Map[String, Set[T]],
    passSet: Set[String],
    targetSet: Set[String],
    total: Set[T]
  ): Map[T, Stat] = map.foldLeft(Map[T, Stat]()) {
    case (m, (name, set)) if targetSet contains name => total.foldLeft(m) {
      case (m, elem) =>
        val covered = set contains elem
        val pass = passSet contains name
        val stat = m.getOrElse(elem, Stat())
        m + (elem -> stat.updated(covered, pass))
    }
    case (m, _) => m
  }
}
