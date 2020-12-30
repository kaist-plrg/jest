package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ElementList2ArrayAccumulation1 extends Algorithm {
  val name: String = "ElementList2ArrayAccumulation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ElementList2ArrayAccumulation1" (this, ElementList, Elision, AssignmentExpression, array, nextIndex) => {
    access __x0__ = (ElementList "ArrayAccumulation")
    app __x1__ = (__x0__ array nextIndex)
    nextIndex = __x1__
    if (is-completion nextIndex) if (= nextIndex["Type"] CONST_normal) nextIndex = nextIndex["Value"] else return nextIndex else {}
    nextIndex
    if (! (= Elision absent)) {
      access __x2__ = (Elision "ArrayAccumulation")
      app __x3__ = (__x2__ array nextIndex)
      nextIndex = __x3__
      if (is-completion nextIndex) if (= nextIndex["Type"] CONST_normal) nextIndex = nextIndex["Value"] else return nextIndex else {}
      nextIndex
    } else {}
    access __x4__ = (AssignmentExpression "Evaluation")
    let initResult = __x4__
    app __x5__ = (GetValue initResult)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let initValue = __x5__
    app __x6__ = (ToString nextIndex)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (CreateDataPropertyOrThrow array __x6__ initValue)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let created = __x7__
    app __x8__ = (WrapCompletion (+ nextIndex 1i))
    return __x8__
  }"""), this)
}
