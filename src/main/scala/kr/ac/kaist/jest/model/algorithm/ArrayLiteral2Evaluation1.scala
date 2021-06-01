package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayLiteral2Evaluation1 extends Algorithm {
  val name: String = "ArrayLiteral2Evaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayLiteral2Evaluation1" (this, ElementList, Elision) => {
    app __x0__ = (ArrayCreate 0i)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    access __x1__ = (ElementList "ArrayAccumulation")
    app __x2__ = (__x1__ array 0i)
    let nextIndex = __x2__
    if (is-completion nextIndex) if (= nextIndex["Type"] CONST_normal) nextIndex = nextIndex["Value"] else return nextIndex else {}
    nextIndex
    if (! (= Elision absent)) {
      access __x3__ = (Elision "ArrayAccumulation")
      app __x4__ = (__x3__ array nextIndex)
      let len = __x4__
      if (is-completion len) if (= len["Type"] CONST_normal) len = len["Value"] else return len else {}
      len
    } else {}
    app __x5__ = (WrapCompletion array)
    return __x5__
  }"""), this)
}
