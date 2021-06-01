package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ElementList0ArrayAccumulation1 extends Algorithm {
  val name: String = "ElementList0ArrayAccumulation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ElementList0ArrayAccumulation1" (this, Elision, AssignmentExpression, array, nextIndex) => {
    if (! (= Elision absent)) {
      access __x0__ = (Elision "ArrayAccumulation")
      app __x1__ = (__x0__ array nextIndex)
      nextIndex = __x1__
      if (is-completion nextIndex) if (= nextIndex["Type"] CONST_normal) nextIndex = nextIndex["Value"] else return nextIndex else {}
      nextIndex
    } else {}
    access __x2__ = (AssignmentExpression "Evaluation")
    let initResult = __x2__
    app __x3__ = (GetValue initResult)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let initValue = __x3__
    app __x4__ = (ToString nextIndex)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (CreateDataPropertyOrThrow array __x4__ initValue)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let created = __x5__
    app __x6__ = (WrapCompletion (+ nextIndex 1i))
    return __x6__
  }"""), this)
}
