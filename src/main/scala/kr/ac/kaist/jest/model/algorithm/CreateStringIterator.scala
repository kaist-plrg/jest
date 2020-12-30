package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateStringIterator extends Algorithm {
  val name: String = "CreateStringIterator"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""CreateStringIterator" (string) => {
    app __x0__ = (Type string)
    assert (= __x0__ String)
    app __x1__ = (OrdinaryObjectCreate INTRINSIC_StringIteratorPrototype (new ["IteratedString", "StringNextIndex"]))
    let iterator = __x1__
    iterator["IteratedString"] = string
    iterator["StringNextIndex"] = 0i
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }"""), this)
}
