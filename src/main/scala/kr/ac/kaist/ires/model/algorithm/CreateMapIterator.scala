package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMapIterator {
  val length: Int = 2
  val func: Func = parseFunc(""""CreateMapIterator" (map, kind) => {
    app __x0__ = (RequireInternalSlot map "MapData")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (ObjectCreate INTRINSIC_MapIteratorPrototype (new ["Map", "MapNextIndex", "MapIterationKind"]))
    let iterator = __x1__
    iterator["Map"] = map
    iterator["MapNextIndex"] = 0i
    iterator["MapIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }""")
}
