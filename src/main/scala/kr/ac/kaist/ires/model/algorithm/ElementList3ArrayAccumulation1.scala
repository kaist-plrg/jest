package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList3ArrayAccumulation1 extends Algorithm {
  val name: String = "ElementList3ArrayAccumulation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ElementList3ArrayAccumulation1" (this, ElementList, Elision, SpreadElement, array, nextIndex) => {
    access __x0__ = (ElementList "ArrayAccumulation")
    app __x1__ = (__x0__ array nextIndex)
    let postIndex = __x1__
    if (is-completion postIndex) if (= postIndex["Type"] CONST_normal) postIndex = postIndex["Value"] else return postIndex else {}
    postIndex
    if (= Elision absent) let padding = 0i else {
      access __x2__ = (Elision "ElisionWidth")
      let padding = __x2__
    }
    access __x3__ = (SpreadElement "ArrayAccumulation")
    app __x4__ = (__x3__ array (+ postIndex padding))
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
