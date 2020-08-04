package kr.ac.kaist.ires.coverage

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Inst._

class Visited {
  private var _instCovered: Set[Int] = Set()
  def instCovered: Set[Int] = _instCovered
  private var _targetCovered: Map[Target, String] = Map()
  def targetCovered: Map[Target, String] = _targetCovered
  private var _touchedAlgos: Set[String] = Set()
  def touchedAlgos: Set[String] = _touchedAlgos

  def get(target: Target): Option[String] = _targetCovered.get(target)
  def apply(target: Target): String = _targetCovered(target)
  def contains(target: Target): Boolean = _targetCovered contains target

  // get if the instruction is is-completion conditions
  def getIfIsCompletion(uid: Int): Option[IIf] = insts(uid) match {
    case (condInst: IIf) => condInst.cond match {
      case EIsCompletion(_) => Some(condInst)
      case _ => None
    }
    case _ => None
  }

  // add/remove covered instructions
  def +=(uid: Int): Unit = if (uid >= 0) _instCovered += uid

  // add/remove covered conditions
  def +=(script: String, target: Target): Unit = {
    val uid = target.uid
    if (uid >= 0) {
      _targetCovered.get(target) match {
        case Some(origScript) if origScript.length <= script.length =>
        case _ => _targetCovered += target -> script
      }
      (target, getIfIsCompletion(uid)) match {
        case (CondTarget(_, true), Some(IIf(c, t, e))) =>
          _targetCovered += CondTarget(uid, false) -> script
          _instCovered += e.uid
        case (CondTarget(_, false), Some(IIf(_, inst @ IIf(_, t, _), _))) =>
          _targetCovered += CondTarget(inst.uid, true) -> script
          _targetCovered += CondTarget(uid, true) -> script
          _instCovered += inst.uid
          _instCovered += t.uid
        case _ =>
      }
    }
  }
  def +=(script: String, uid: Int, value: Value): Unit = if (uid >= 0) value match {
    case Bool(b) => this += (script, CondTarget(uid, b))
    case Str(str) => this += (script, KindTarget(uid, str))
    case _ =>
  }

  // add/remove touched algorithm name
  def +=(algoName: String): Unit = _touchedAlgos += algoName

  // merge another Visited
  def ++=(that: Visited): Unit = {
    this._instCovered ++= that._instCovered
    for ((target, script) <- that._targetCovered) this += (script, target)
  }

  // check subset relations
  def subsetOf(that: Visited): Boolean = (
    (this._instCovered subsetOf that._instCovered) &&
    (this._targetCovered.keySet subsetOf that._targetCovered.keySet)
  )

  // get coverage
  def getCoverage: Coverage = Coverage(insts.map(inst => {
    val instStr = beautify(inst, detail = false)
    val uid = inst.uid
    val algo = instToAlgo(uid)
    val algoName = algo.name
    val covered = this._instCovered.contains(uid)
    inst match {
      case (condInst: CondInst) =>
        val cond = beautify(condInst.cond)
        val thenCovered = this._targetCovered.get(CondTarget(uid, true))
        val elseCovered = this._targetCovered.get(CondTarget(uid, false))
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
          val algoCovered = _instCovered.filter(uids.contains(_))
          val algoCondCovered = _targetCovered.keySet.flatMap {
            case CondTarget(uid, pass) if uids.contains(uid) => Some((uid, pass))
            case _ => None
          }
          AlgoCoverage(name, algoInsts, algoCovered, algoCondCovered)
        }
      }
      .toList
      .sortBy(_.name)

  // simple String
  def simpleString: String = s"(${_instCovered.size}, ${_targetCovered.size})"
}

object Visited {
  val global: Visited = new Visited
}
