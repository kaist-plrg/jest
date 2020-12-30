package kr.ac.kaist.jest.localizer

import kr.ac.kaist.jest._
import kr.ac.kaist.jest.ir.beautify
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.util.Useful._

case class LocalizeResult(
    instScores: List[(Int, Double)],
    algoScores: List[(String, Double)]
) {
  // method-level aggregation
  lazy val agAlgoScores: List[(String, Double)] =
    instScores.foldLeft(Map[String, Double]()) {
      case (m, (uid, score)) => {
        val algoName = instToAlgo(uid).name
        if (!m.contains(algoName)) m + (algoName -> score)
        else m
      }
    }.toList.sortWith(_._2 > _._2)

  // dump
  def dump(dir: String) = {
    mkdir(dir)
    dumpInst(s"$dir/inst")
    dumpAlgo(s"$dir/algo")
    dumpAlgoAggregated(s"$dir/algo-aggregated")
  }

  // get rank
  def getRank[T](m: List[(T, Double)], elem: T): Int =
    m.indexOf(m.find(_._1 == elem).get) + 1
  def getInstRank(uid: Int): Int = getRank(instScores, uid)
  def getAlgoRank(name: String): Int = getRank(algoScores, name)
  def getAgAlgoRank(name: String): Int = getRank(agAlgoScores, name)

  // dump instruction scores
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

  // dump algorithm scores
  private def dumpAlgo(filepath: String): Unit = {
    val algoContent = algoScores.zipWithIndex.map {
      case ((algoName, score), rank) =>
        f"$rank%8d $score%8.4f $algoName"
    }.mkString(LINE_SEP)
    dumpFile(algoContent, filepath)
  }

  // dump method-level aggregated scores
  private def dumpAlgoAggregated(filepath: String): Unit = {
    val agAlgoContent = agAlgoScores.zipWithIndex.map {
      case ((algoName, score), rank) =>
        f"$rank%8d $score%8.4f $algoName"
    }.mkString(LINE_SEP)
    dumpFile(agAlgoContent, filepath)
  }
}
