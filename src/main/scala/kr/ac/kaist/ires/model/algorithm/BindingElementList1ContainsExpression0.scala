package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElementList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingElementList1ContainsExpression0""", List(Id("""this"""), Id("""BindingElementList"""), Id("""BindingElisionElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""ContainsExpression""")), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElisionElement"""))), EStr("""ContainsExpression""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "BindingElementList1ContainsExpression0" (this, BindingElementList, BindingElisionElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElisionElement "ContainsExpression")
    return __x1__
  }
  */
}
