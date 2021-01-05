package kr.ac.kaist.jest.mutator

import kr.ac.kaist.jest.model._
import kr.ac.kaist.jest.ir.Inst._
import kr.ac.kaist.jest.ir.{ CondInst, EBOp, ERef, EStr, OEq, RefId }
import kr.ac.kaist.jest.util.Useful.randBool

case class StringSubstitution(
    uid: Int,
    script: Script
) extends Mutator with Walker {
  val name = "String Substitution"
  val candidate = insts(uid) match {
    case condInst: CondInst => condInst.cond match {
      case EBOp(OEq, ERef(RefId(_)), EStr(string)) => Some(s"'$string'")
      case EBOp(OEq, EStr(string), ERef(RefId(_))) => Some(s"'$string'")
      case _ => None
    }
    case _ => None
  }

  val weight = candidate.fold(0)(_ => MINOR)
  def mutateOption = candidate.map(_ => walk(script))

  override def walk(ast: AssignmentExpression): AssignmentExpression = {
    if (randBool) Parser.parse(Parser.AssignmentExpression(ast.parserParams), candidate.get).get
    else super.walk(ast)
  }
}
