package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans1TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail"""), Id("""raw""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""TemplateStrings""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""raw"""))))), ILet(Id("""middle"""), ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x2__""")))))), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TRV""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x3__"""))))))), IReturn(EList(List(ERef(RefId(Id("""middle"""))), ERef(RefId(Id("""tail""")))))))))
  /* Beautified form:
  "TemplateSpans1TemplateStrings0" (this, TemplateMiddleList, TemplateTail, raw) => {
    access __x0__ = (TemplateMiddleList "TemplateStrings")
    app __x1__ = (__x0__ raw)
    let middle = __x1__
    if (= raw false) {
      access __x2__ = (TemplateTail "TV")
      let tail = __x2__
    } else {
      access __x3__ = (TemplateTail "TRV")
      let tail = __x3__
    }
    return (new [middle, tail])
  }
  */
}
