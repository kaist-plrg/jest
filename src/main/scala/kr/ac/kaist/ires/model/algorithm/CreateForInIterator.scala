package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateForInIterator {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateForInIterator" (object) => {
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
  }""")
}
