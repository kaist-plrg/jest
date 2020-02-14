package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowParameters1IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters1IsSimpleParameterList0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredFormalsList""")), ILet(Id("""formals"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""IsSimpleParameterList""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ArrowParameters1IsSimpleParameterList0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "IsSimpleParameterList")
    return __x1__
  }
  */
}
