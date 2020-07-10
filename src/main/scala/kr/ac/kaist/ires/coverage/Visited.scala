package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._

class Visited {
  private var instCovered: Set[Int] = Set()
  private var condCovered: Set[(Int, Boolean)] = Set()

  // add covered instructions
  def +=(uid: Int): Unit = if (uid >= 0) instCovered += uid

  // add covered conditions
  def +=(uid: Int, value: Value): Unit = value match {
    case Bool(b) if uid >= 0 => condCovered += ((uid, b))
    case _ =>
  }

  // merge another Visited
  def ++=(that: Visited): Unit = {
    this.instCovered ++= that.instCovered
    this.condCovered ++= that.condCovered
  }

  // check subset relations
  def subsetOf(that: Visited): Boolean = (
    (this.instCovered subsetOf that.instCovered) &&
    (this.condCovered subsetOf that.condCovered)
  )

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
}

object Visited {
  val global: Visited = new Visited
}
