package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateForInIterator extends Algorithm {
  val name: String = "CreateForInIterator"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateForInIterator" (object) => {
    app __x0__ = (Type object)
    assert (= __x0__ Object)
    app __x1__ = (OrdinaryObjectCreate INTRINSIC_ForInIteratorPrototype (new ["Object", "ObjectWasVisited", "VisitedKeys", "RemainingKeys"]))
    let iterator = __x1__
    iterator["Object"] = object
    iterator["ObjectWasVisited"] = false
    iterator["VisitedKeys"] = (new [])
    iterator["RemainingKeys"] = (new [])
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }"""), this)
}
