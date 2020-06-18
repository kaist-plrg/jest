package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.COVERAGE_DIR
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._
import kr.ac.kaist.ires.util.Useful._

case class Coverage(cases: Vector[Case])
object Coverage extends CoverageProtocol {
  // covered instructions
  private var instCovered: Set[Int] = Set()
  def add(uid: Int): Unit = if (uid >= 0) instCovered += uid

  // covered conditions
  private var condCovered: Set[(Int, Boolean)] = Set()
  def add(uid: Int, value: Value): Unit = if (uid >= 0) value match {
    case Bool(b) => condCovered += ((uid, b))
    case _ =>
  }

  // get coverage
  def getCoverage: Coverage = Coverage(insts.map(inst => {
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
  }))

  // dump coverage statistics
  def dumpStat: Unit = {
    // directory for coverage results
    mkdir(COVERAGE_DIR)

    // dump coverage
    val coverage = getCoverage
    dumpJson(coverage, s"$COVERAGE_DIR/coverage.json")

    val stat = CoverageStat(coverage)
    println(stat.summary)
    stat.dump
  }
}
