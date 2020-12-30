package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateMapIterator extends Algorithm {
  val name: String = "CreateMapIterator"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""CreateMapIterator" (map, kind) => {
    app __x0__ = (RequireInternalSlot map "MapData")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (OrdinaryObjectCreate INTRINSIC_MapIteratorPrototype (new ["IteratedMap", "MapNextIndex", "MapIterationKind"]))
    let iterator = __x1__
    iterator["IteratedMap"] = map
    iterator["MapNextIndex"] = 0i
    iterator["MapIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }"""), this)
}
