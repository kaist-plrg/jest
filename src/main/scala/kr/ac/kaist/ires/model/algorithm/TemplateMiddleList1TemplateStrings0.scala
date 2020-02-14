package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList1TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList1TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateMiddle"""), Id("""Expression"""), Id("""raw""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""TemplateStrings""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""raw"""))))), ILet(Id("""front"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")), ILet(Id("""last"""), ERef(RefId(Id("""__x2__""")))))), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TRV""")), ILet(Id("""last"""), ERef(RefId(Id("""__x3__"""))))))), IAppend(ERef(RefId(Id("""last"""))), ERef(RefId(Id("""front""")))), IReturn(ERef(RefId(Id("""front""")))))))
  /* Beautified form:
  "TemplateMiddleList1TemplateStrings0" (this, TemplateMiddleList, TemplateMiddle, Expression, raw) => {
    access __x0__ = (TemplateMiddleList "TemplateStrings")
    app __x1__ = (__x0__ raw)
    let front = __x1__
    if (= raw false) {
      access __x2__ = (TemplateMiddle "TV")
      let last = __x2__
    } else {
      access __x3__ = (TemplateMiddle "TRV")
      let last = __x3__
    }
    append last -> front
    return front
  }
  */
}
