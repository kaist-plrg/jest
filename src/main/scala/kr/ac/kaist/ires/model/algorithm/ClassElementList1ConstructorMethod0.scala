package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList1ConstructorMethod0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ClassElementList1ConstructorMethod0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "ConstructorMethod")
    let head = __x0__
    if (! (= head CONST_empty)) return head else {}
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return CONST_empty else {}
    access __x2__ = (ClassElement "PropName")
    if (! (= __x2__ "constructor")) return CONST_empty else {}
    return ClassElement
  }""")
}
