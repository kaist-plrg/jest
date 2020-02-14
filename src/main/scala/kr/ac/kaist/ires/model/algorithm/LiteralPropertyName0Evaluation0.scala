package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName0Evaluation0""", List(Id("""this"""), Id("""IdentifierName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "LiteralPropertyName0Evaluation0" (this, IdentifierName) => {
    access __x0__ = (IdentifierName "StringValue")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
