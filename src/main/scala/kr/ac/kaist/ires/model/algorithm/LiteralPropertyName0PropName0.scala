package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName0PropName0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName0PropName0""", List(Id("""this"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "LiteralPropertyName0PropName0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    return __x0__
  }
  */
}
