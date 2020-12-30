package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ElementList3ArrayAccumulation1 extends Algorithm {
  val name: String = "ElementList3ArrayAccumulation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ElementList3ArrayAccumulation1" (this, ElementList, Elision, SpreadElement, array, nextIndex) => {
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
    access __x4__ = (SpreadElement "ArrayAccumulation")
    app __x5__ = (__x4__ array nextIndex)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
