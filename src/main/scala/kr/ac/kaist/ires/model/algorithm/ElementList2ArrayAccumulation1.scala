package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList2ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""ElementList2ArrayAccumulation1" (this, ElementList, Elision, AssignmentExpression, array, nextIndex) => {
    access __x0__ = (ElementList "ArrayAccumulation")
    app __x1__ = (__x0__ array nextIndex)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let postIndex = __x1__
    if (= Elision absent) let padding = 0i else {
      access __x2__ = (Elision "ElisionWidth")
      let padding = __x2__
    }
    access __x3__ = (AssignmentExpression "Evaluation")
    let initResult = __x3__
    app __x4__ = (GetValue initResult)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let initValue = __x4__
    app __x5__ = (ToUint32 (+ postIndex padding))
    app __x6__ = (ToString __x5__)
    app __x7__ = (CreateDataProperty array __x6__ initValue)
    let created = __x7__
    assert (= created true)
    app __x8__ = (WrapCompletion (+ (+ postIndex padding) 1i))
    return __x8__
  }""")
}
