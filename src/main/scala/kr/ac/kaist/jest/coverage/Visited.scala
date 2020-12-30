package kr.ac.kaist.jest.coverage

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.util.Useful._

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

  def isCompletionChecker(inst: Inst): Boolean = inst match {
    case IIf(EIsCompletion(_), _, _) => true
    case _ => false
  }
  def isNormalChecker(inst: Inst): Boolean = inst match {
    case IIf(EBOp(OEq, _, ERef(RefId(Id("CONST_normal")))), _, _) => true
    case _ => false
  }
  def getCompletionTarget(inst: Inst, bool: Boolean): Option[CompletionTarget] = {
    if (isCompletionChecker(inst) && !bool) Some(CompletionTarget(inst.uid, true))
    else if (isNormalChecker(inst)) {
      val uid = inst.uid
      val prev = insts(uid - 1)
      if (isCompletionChecker(prev)) Some(CompletionTarget(uid - 1, bool))
      else None
    } else None
  }
  def getTarget(inst: Inst, bool: Boolean, updated: Boolean = false): Target = {
    getCompletionTarget(inst, bool) match {
      case Some(compTarget @ CompletionTarget(uid, normal)) =>
        if (normal && updated) _instCovered ++= Set(uid + 1, uid + 2, uid + 4)
        compTarget
      case None => CondTarget(inst.uid, bool)
    }
  }

  // add/remove covered instructions
  def +=(uid: Int): Unit = if (uid >= 0) _instCovered += uid

  // add/remove covered conditions
  def +=(script: String, target: Target): Unit = {
    val uid = target.uid
    if (uid >= 0) _targetCovered.get(target) match {
      case Some(origScript) if origScript.length <= script.length =>
      case _ => _targetCovered += target -> script
    }
  }
  def +=(script: String, uid: Int, value: Value): Unit = if (uid >= 0) value match {
    case Bool(b) => this += (script, getTarget(insts(uid), b, true))
    case Str(str) => this += (script, KindTarget(uid, str))
    case _ =>
  }

  // add/remove touched algorithm name
  def +=(algoName: String): Unit = _touchedAlgos += getScalaName(algoName)

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
    val covered = _instCovered.contains(uid)
    inst match {
      case (condInst: CondInst) =>
        val cond = beautify(condInst.cond)
        var thenCovered = _targetCovered.get(getTarget(inst, true))
        val elseCovered = _targetCovered.get(getTarget(inst, false))
        if (isCompletionChecker(condInst)) thenCovered.fold(elseCovered)(Some(_))
        Cond(algoName, instStr, covered, cond, thenCovered, elseCovered)
      case _ => Base(algoName, instStr, covered)
    }
  }))

  def getAlgoCoverages: List[AlgoCoverage] = {
    val coverage = getCoverage
    insts
      .toList
      .groupBy(inst => instToAlgo(inst.uid).name)
      .map {
        case (name, algoInsts) => {
          val uids = algoInsts.map(_.uid).toSet
          val algoCovered = _instCovered.filter(uids.contains(_))
          val algoCondCovered = coverage.cases.zipWithIndex.flatMap {
            case (Cond(_, _, _, _, thenCovered, elseCovered), uid) if uids.contains(uid) =>
              var set = Set[(Int, Boolean)]()
              if (thenCovered.isDefined) set += uid -> true
              if (elseCovered.isDefined) set += uid -> false
              set
            case _ => Set()
          }.toSet
          AlgoCoverage(name, algoInsts, algoCovered, algoCondCovered)
        }
      }
      .toList
      .sortBy(_.name)
  }

  // simple String
  def simpleString: String = s"(${_instCovered.size}, ${_targetCovered.size})"
}

object Visited {
  val global: Visited = new Visited
}
