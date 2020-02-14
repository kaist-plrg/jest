package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression12HasName0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12HasName0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), IReturn(EBool(false)), ISeq(List())), IAccess(Id("""__x2__"""), ERef(RefId(Id("""expr"""))), EStr("""HasName""")), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "PrimaryExpression12HasName0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "IsFunctionDefinition")
    if (= __x1__ false) return false else {}
    access __x2__ = (expr "HasName")
    return __x2__
  }
  */
}
