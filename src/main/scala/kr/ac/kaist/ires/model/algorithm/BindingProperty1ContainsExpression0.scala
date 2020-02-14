package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1ContainsExpression0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""IsComputedPropertyKey""")), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)), ISeq(List())), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""ContainsExpression""")), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "BindingProperty1ContainsExpression0" (this, PropertyName, BindingElement) => {
    access __x0__ = (PropertyName "IsComputedPropertyKey")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElement "ContainsExpression")
    return __x1__
  }
  */
}
