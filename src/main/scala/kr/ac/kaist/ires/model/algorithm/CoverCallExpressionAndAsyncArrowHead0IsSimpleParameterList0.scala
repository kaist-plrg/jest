package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CoverCallExpressionAndAsyncArrowHead0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""CoverCallExpressionAndAsyncArrowHead0IsSimpleParameterList0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""CoveredAsyncArrowHead""")), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""head"""))), EStr("""IsSimpleParameterList""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "CoverCallExpressionAndAsyncArrowHead0IsSimpleParameterList0" (this, MemberExpression, Arguments) => {
    access __x0__ = (this "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "IsSimpleParameterList")
    return __x1__
  }
  */
}
