package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ElementList1ArrayAccumulation1 extends Algorithm {
  val name: String = "ElementList1ArrayAccumulation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ElementList1ArrayAccumulation1" (this, Elision, SpreadElement, array, nextIndex) => {
    if (! (= Elision absent)) {
      access __x0__ = (Elision "ArrayAccumulation")
      app __x1__ = (__x0__ array nextIndex)
      nextIndex = __x1__
      if (is-completion nextIndex) if (= nextIndex["Type"] CONST_normal) nextIndex = nextIndex["Value"] else return nextIndex else {}
      nextIndex
    } else {}
    access __x2__ = (SpreadElement "ArrayAccumulation")
    app __x3__ = (__x2__ array nextIndex)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
