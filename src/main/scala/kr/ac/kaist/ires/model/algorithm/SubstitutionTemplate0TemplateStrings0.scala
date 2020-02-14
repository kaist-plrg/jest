package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SubstitutionTemplate0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0TemplateStrings0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TV""")), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TRV""")), ILet(Id("""head"""), ERef(RefId(Id("""__x1__"""))))))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""TemplateStrings""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""raw"""))))), ILet(Id("""tail"""), ERef(RefId(Id("""__x3__""")))), IReturn(EList(List(ERef(RefId(Id("""head"""))), ERef(RefId(Id("""tail""")))))))))
  /* Beautified form:
  "SubstitutionTemplate0TemplateStrings0" (this, TemplateHead, Expression, TemplateSpans, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateHead "TV")
      let head = __x0__
    } else {
      access __x1__ = (TemplateHead "TRV")
      let head = __x1__
    }
    access __x2__ = (TemplateSpans "TemplateStrings")
    app __x3__ = (__x2__ raw)
    let tail = __x3__
    return (new [head, tail])
  }
  */
}
