package kr.ac.kaist.jest.ir

import kr.ac.kaist.jest.COVERAGE_MODE
import kr.ac.kaist.jest.model.Algorithm
import scala.collection.mutable.{ Map => MMap }

// IR Instructions
sealed trait Inst extends IRNode {
  private var algo: Option[Algorithm] = None
  lazy val uid: Int = algo match {
    case Some(algo) if COVERAGE_MODE =>
      val uid = Inst.insts.size
      Inst._insts :+= this
      Inst._instToAlgo :+= algo
      uid
    case _ => -1
  }

  def setAlgo(algo: Algorithm): Unit = this.algo = Some(algo)
}
object Inst {
  private var _insts: Vector[Inst] = Vector()
  def insts: Vector[Inst] = _insts

  private var _instToAlgo: Vector[Algorithm] = Vector()
  def instToAlgo: Vector[Algorithm] = _instToAlgo
}

// conditional instructions
sealed trait CondInst extends Inst { val cond: Expr }
case class IIf(cond: Expr, thenInst: Inst, elseInst: Inst) extends CondInst
case class IWhile(cond: Expr, body: Inst) extends CondInst

// other instructions
case class IExpr(expr: Expr) extends Inst
case class ILet(id: Id, expr: Expr) extends Inst
case class IAssign(ref: Ref, expr: Expr) extends Inst
case class IDelete(ref: Ref) extends Inst
case class IAppend(expr: Expr, list: Expr) extends Inst
case class IPrepend(expr: Expr, list: Expr) extends Inst
case class IReturn(expr: Expr) extends Inst
case class ISeq(insts: List[Inst]) extends Inst
case class IAssert(expr: Expr) extends Inst
case class IPrint(expr: Expr) extends Inst
case class IApp(id: Id, fexpr: Expr, args: List[Expr]) extends Inst
case class IAccess(id: Id, bexpr: Expr, expr: Expr) extends Inst
case class IWithCont(id: Id, params: List[Id], bodyInst: Inst) extends Inst
case class ISetType(expr: Expr, ty: Ty) extends Inst
