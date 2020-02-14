package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0TemplateStrings0""", List(Id("""this"""), Id("""TemplateTail"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x0__""")))))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TRV""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x1__"""))))))), IReturn(EList(List(ERef(RefId(Id("""tail""")))))))))
  /* Beautified form:
  "TemplateSpans0TemplateStrings0" (this, TemplateTail, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateTail "TV")
      let tail = __x0__
    } else {
      access __x1__ = (TemplateTail "TRV")
      let tail = __x1__
    }
    return (new [tail])
  }
  */
}
