package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._

class Visited {
  private var instCovered: Set[Int] = Set()
  def getInstCovered: Set[Int] = instCovered
  private var condCovered: Map[(Int, Boolean), String] = Map()
  def getCondCovered: Map[(Int, Boolean), String] = condCovered

  // get if the instruction is is-completion conditions
  def getIfIsCompletion(uid: Int): Option[IIf] = insts(uid) match {
    case (condInst: IIf) => condInst.cond match {
      case EIsCompletion(_) => Some(condInst)
      case _ => None
    }
    case _ => None
  }

  // add/remove covered instructions
  def +=(uid: Int): Unit = if (uid >= 0) instCovered += uid

  // add/remove covered conditions
  def +=(script: String, uid: Int, pass: Boolean): Unit = {
    val pair = (uid, pass)
    if (uid >= 0) {
      condCovered += pair -> script
      getIfIsCompletion(uid) match {
        case Some(IIf(c, t, e)) =>
          condCovered += ((uid, !pass)) -> script
          instCovered += e.uid
        case None =>
      }
    }
  }
  def +=(script: String, uid: Int, value: Value): Unit = value match {
    case Bool(b) if uid >= 0 => this += (script, uid, b)
    case _ =>
  }

  // merge another Visited
  def ++=(that: Visited): Unit = {
    this.instCovered ++= that.instCovered
    for ((cond, script) <- that.condCovered) this.condCovered.get(cond) match {
      case Some(orig) if script.length >= orig.length =>
      case _ => condCovered += cond -> script
    }
  }

  // check subset relations
  def subsetOf(that: Visited): Boolean = (
    (this.instCovered subsetOf that.instCovered) &&
    (this.condCovered.keySet subsetOf that.condCovered.keySet)
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
        val thenCovered = this.condCovered.get((uid, true))
        val elseCovered = this.condCovered.get((uid, false))
        Cond(algoName, instStr, covered, cond, thenCovered, elseCovered)
      case _ => Base(algoName, instStr, covered)
    }
  }))

  def getAlgoCoverages: List[AlgoCoverage] =
    insts
      .toList
      .groupBy(inst => instToAlgo(inst.uid).name)
      .map {
        case (name, algoInsts) => {
          val uids = algoInsts.map(_.uid).toSet
          val algoCovered = instCovered.filter(uids.contains(_))
          val algoCondCovered = condCovered.keySet.filter(c => uids.contains(c._1))
          AlgoCoverage(name, algoInsts, algoCovered, algoCondCovered)
        }
      }
      .toList
      .sortBy(_.name)

  // simple String
  def simpleString: String = s"(${instCovered.size}, ${condCovered.size})"
}

object Visited {
  val global: Visited = new Visited
}
