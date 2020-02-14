package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression0IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression0IsDestructuring0""", List(Id("""this"""), Id("""PrimaryExpression""")), None, ISeq(List(IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""PrimaryExpression"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""PrimaryExpression"""))), """ArrayLiteral""")), IReturn(EBool(true)), ISeq(List())), IReturn(EBool(false)))))
  /* Beautified form:
  "MemberExpression0IsDestructuring0" (this, PrimaryExpression) => {
    if (|| (is-instance-of PrimaryExpression ObjectLiteral) (is-instance-of PrimaryExpression ArrayLiteral)) return true else {}
    return false
  }
  */
}
