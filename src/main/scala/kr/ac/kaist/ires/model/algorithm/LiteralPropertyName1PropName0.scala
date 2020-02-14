package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName1PropName0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName1PropName0""", List(Id("""this"""), Id("""StringLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StringLiteral"""))), EStr("""SV""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "LiteralPropertyName1PropName0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "SV")
    return __x0__
  }
  */
}
