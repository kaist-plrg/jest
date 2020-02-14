package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""BreakStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""__x0__"""))))), IReturn(EBool(true)), ISeq(List())), IReturn(EBool(false)))))
  /* Beautified form:
  "BreakStatement1ContainsUndefinedBreakTarget0" (this, LabelIdentifier, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains labelSet __x0__)) return true else {}
    return false
  }
  */
}
