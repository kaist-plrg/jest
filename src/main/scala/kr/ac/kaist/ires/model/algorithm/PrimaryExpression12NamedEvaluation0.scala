package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression12NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12NamedEvaluation0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""NamedEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""name"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "PrimaryExpression12NamedEvaluation0" (this, CoverParenthesizedExpressionAndArrowParameterList, name) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "NamedEvaluation")
    app __x2__ = (__x1__ name)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
