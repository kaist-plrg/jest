package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateLiteral0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateLiteral0ArgumentListEvaluation0""", List(Id("""this"""), Id("""NoSubstitutionTemplate""")), None, ISeq(List(ILet(Id("""templateLiteral"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetTemplateObject"""))), List(ERef(RefId(Id("""templateLiteral"""))))), ILet(Id("""siteObj"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""siteObj"""))))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "TemplateLiteral0ArgumentListEvaluation0" (this, NoSubstitutionTemplate) => {
    let templateLiteral = this
    app __x0__ = (GetTemplateObject templateLiteral)
    let siteObj = __x0__
    app __x1__ = (WrapCompletion (new [siteObj]))
    return __x1__
  }
  */
}
