package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0Evaluation0""", List(Id("""this"""), Id("""TemplateTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")), ILet(Id("""tail"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""tail"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "TemplateSpans0Evaluation0" (this, TemplateTail) => {
    access __x0__ = (TemplateTail "TV")
    let tail = __x0__
    app __x1__ = (WrapCompletion tail)
    return __x1__
  }
  */
}
