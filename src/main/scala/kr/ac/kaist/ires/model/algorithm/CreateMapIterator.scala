package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateMapIterator extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""CreateMapIterator" (map, kind) => {
    app __x0__ = (Type map)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= map["MapData"] absent) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (ObjectCreate INTRINSIC_MapIteratorPrototype (new ["Map", "MapNextIndex", "MapIterationKind"]))
    let iterator = __x3__
    iterator["Map"] = map
    iterator["MapNextIndex"] = 0i
    iterator["MapIterationKind"] = kind
    app __x4__ = (WrapCompletion iterator)
    return __x4__
  }""")
}
