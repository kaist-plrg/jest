package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateArrayIterator {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""CreateArrayIterator" (array, kind) => {
    app __x0__ = (Type array)
    assert (= __x0__ Object)
    app __x1__ = (ObjectCreate INTRINSIC_ArrayIteratorPrototype (new ["IteratedObject", "ArrayIteratorNextIndex", "ArrayIterationKind"]))
    let iterator = __x1__
    iterator["IteratedObject"] = array
    iterator["ArrayIteratorNextIndex"] = 0i
    iterator["ArrayIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }""")
}
