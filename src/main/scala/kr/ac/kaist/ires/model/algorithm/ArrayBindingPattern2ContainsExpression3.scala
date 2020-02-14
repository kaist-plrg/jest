package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern2ContainsExpression3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2ContainsExpression3""", List(Id("""this"""), Id("""BindingElementList"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""ContainsExpression""")), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""ContainsExpression""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ArrayBindingPattern2ContainsExpression3" (this, BindingElementList, Elision, BindingRestElement) => {
    access __x0__ = (BindingElementList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingRestElement "ContainsExpression")
    return __x1__
  }
  */
}
