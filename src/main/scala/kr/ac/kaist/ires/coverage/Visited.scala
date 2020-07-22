package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._

class Visited {
  private var instCovered: Set[Int] = Set()
  def getInstCovered: Set[Int] = instCovered
  private var condCovered: Set[(Int, Boolean)] = Set()
  def getCondCovered: Set[(Int, Boolean)] = condCovered

  // check is-completion conditions
  def checkIsCompletion(uid: Int): Boolean = insts(uid) match {
    case (condInst: CondInst) => condInst.cond match {
      case EIsCompletion(_) => true
      case _ => false
    }
    case _ => false
  }

  // add covered instructions
  def +=(uid: Int): Unit = if (uid >= 0) instCovered += uid
  def -=(uid: Int): Unit = if (uid >= 0) instCovered -= uid

  // add covered conditions
  def +=(pair: (Int, Boolean)): Unit = {
    val (uid, pass) = pair
    if (uid >= 0) {
      condCovered += pair
      if (checkIsCompletion(uid)) condCovered += ((uid, !pass))
    }
  }
  def -=(pair: (Int, Boolean)): Unit = {
    val (uid, pass) = pair
    if (uid >= 0) {
      condCovered -= pair
      if (checkIsCompletion(uid)) condCovered -= pair
    }
  }
  def +=(uid: Int, value: Value): Unit = value match {
    case Bool(b) if uid >= 0 => this += ((uid, b))
    case _ =>
  }
  def -=(uid: Int, value: Value): Unit = value match {
    case Bool(b) if uid >= 0 => this -= ((uid, b))
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

  // simple String
  def simpleString: String = s"(${instCovered.size}, ${condCovered.size})"
}

object Visited {
  val global: Visited = new Visited
}
