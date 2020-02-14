package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList0TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddle"""), Id("""Expression"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TRV""")), ILet(Id("""string"""), ERef(RefId(Id("""__x1__"""))))))), IReturn(EList(List(ERef(RefId(Id("""string""")))))))))
  /* Beautified form:
  "TemplateMiddleList0TemplateStrings0" (this, TemplateMiddle, Expression, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateMiddle "TV")
      let string = __x0__
    } else {
      access __x1__ = (TemplateMiddle "TRV")
      let string = __x1__
    }
    return (new [string])
  }
  */
}
