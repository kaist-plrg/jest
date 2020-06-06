package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires._
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.util.Useful._
import spray.json._

object CoverageCheck extends CoverageProtocol {
  // coverage of instructions
  private var instCovered: Set[Int] = Set()
  def instTotal: Set[Int] = insts.map(_.uid).toSet
  def add(uid: Int): Unit = if (uid >= 0) instCovered += uid
  def instRatio = getPercent(instCovered, instTotal)

  // coverage of conditions
  def condTotal: Set[(Int, Boolean)] = instTotal.flatMap(uid => insts(uid) match {
    case (_: CondInst) => List((uid, true), (uid, false))
    case _ => Nil
  }).toSet
  private var condCovered: Set[(Int, Boolean)] = Set()
  def add(uid: Int, value: Value): Unit = if (uid >= 0) value match {
    case Bool(b) => condCovered += ((uid, b))
    case _ =>
  }
  def condRatio = getPercent(condCovered, condTotal)

  // get short results
  def getPercent[T](passSet: Set[T], totalSet: Set[T]): String = {
    val total = totalSet.size
    val pass = passSet.size
    val ratio = pass.toDouble / total * 100
    f"$pass / $total ($ratio%.2f%%)"
  }

  // get coverage status
  def getCoverage: Coverage = Coverage(insts.toList.map {
    case inst =>
      val instStr = beautify(inst, detail = false)
      val uid = inst.uid
      val algo = instToAlgo(uid)
      val algoName = algo.name
      val covered = this.instCovered.contains(uid)
      inst match {
        case (condInst: CondInst) =>
          val cond = beautify(condInst.cond)
          val thenCovered = this.condCovered.contains((uid, true))
          val elseCovered = this.condCovered.contains((uid, false))
          Cond(algoName, instStr, covered, cond, thenCovered, elseCovered)
        case _ => Base(algoName, instStr, covered)
      }
  })

  // show intermediate coverage // TODO remove
  private var time: Long = 0
  def updateTime: Unit = {
    val newTime = System.currentTimeMillis
    if (time + 10000 < newTime) {
      time = newTime
      println(getSummary)
    }
  }

  def getSummary: String = {
    val instRatio = getPercent(instCovered, instTotal)
    val condRatio = getPercent(condCovered, condTotal)

    val allAlgo = instTotal.map(instToAlgo)
    val instNotCovered = instTotal -- instCovered
    val neverVisit = allAlgo -- instCovered.map(instToAlgo)
    val allVisit = allAlgo -- instNotCovered.map(instToAlgo)
    val onceVisit = allAlgo -- allVisit -- neverVisit
    val neverRatio = getPercent(neverVisit, allAlgo)
    val onceRatio = getPercent(onceVisit, allAlgo)
    val allRatio = getPercent(allVisit, allAlgo)
    f"Coverage:" + LINE_SEP +
      f"- Inst: $instRatio" + LINE_SEP +
      f"- Cond: $condRatio" + LINE_SEP +
      f"Visit Algorithm:" + LINE_SEP +
      f"- Never: $neverRatio" + LINE_SEP +
      f"- Once : $onceRatio" + LINE_SEP +
      f"- All  : $allRatio"
  }

  def dumpResult: Unit = {
    val summary = getSummary
    println(summary)

    // directory for coverage results
    val COVERAGE_DIR = s"$BASE_DIR/coverage"
    mkdir(COVERAGE_DIR)

    // dump coverage as JSON
    var nf = getPrintWriter(s"$COVERAGE_DIR/coverage.json")
    nf.print(getCoverage.toJson)
    nf.close()

    // dump summary
    nf = getPrintWriter(s"$COVERAGE_DIR/summary")
    nf.print(summary)
    nf.close()
  }
}
