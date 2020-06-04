package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSetIterator extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""CreateSetIterator" (set, kind) => {
    app __x0__ = (Type set)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= set["SetData"] absent) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (ObjectCreate INTRINSIC_SetIteratorPrototype (new ["IteratedSet", "SetNextIndex", "SetIterationKind"]))
    let iterator = __x3__
    iterator["IteratedSet"] = set
    iterator["SetNextIndex"] = 0i
    iterator["SetIterationKind"] = kind
    app __x4__ = (WrapCompletion iterator)
    return __x4__
  }""")
}
