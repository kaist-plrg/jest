package kr.ac.kaist.ires.ir

import kr.ac.kaist.ires.COVERAGE_MODE
import kr.ac.kaist.ires.error.CoverageError
import scala.collection.mutable.{ Map => MMap }

// IR Instructions
sealed trait Inst extends IRNode {
  lazy val uid: Int = if (COVERAGE_MODE) {
    val id = Inst.size
    Inst._insts +:= this
    id
  } else throw CoverageError(s"`uid` of Inst should be only used in the coverage mode")
}
object Inst {
  private var _insts: Vector[Inst] = Vector()
  def size: Int = insts.length
  def insts: Vector[Inst] = _insts
  def conds: Vector[CondInst] = insts.flatMap(_ match {
    case (condInst: CondInst) => Some(condInst)
    case _ => None
  })
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
