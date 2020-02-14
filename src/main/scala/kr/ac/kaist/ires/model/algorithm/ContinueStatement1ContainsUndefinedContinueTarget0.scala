package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ContinueStatement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""ContinueStatement1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""iterationSet"""))), ERef(RefId(Id("""__x0__"""))))), IReturn(EBool(true)), ISeq(List())), IReturn(EBool(false)))))
  /* Beautified form:
  "ContinueStatement1ContainsUndefinedContinueTarget0" (this, LabelIdentifier, iterationSet, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains iterationSet __x0__)) return true else {}
    return false
  }
  */
}
