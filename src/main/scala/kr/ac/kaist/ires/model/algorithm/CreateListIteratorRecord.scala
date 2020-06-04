package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateListIteratorRecord extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""CreateListIteratorRecord" (list) => {
    app __x0__ = (ObjectCreate INTRINSIC_IteratorPrototype (new ["IteratedList", "ListIteratorNextIndex"]))
    let iterator = __x0__
    iterator["IteratedList"] = list
    iterator["ListIteratorNextIndex"] = 0i
    let steps = (new algorithm("name" -> "next", "length" -> 0i, "step" -> ListIteratornext))
    app __x1__ = (CreateBuiltinFunction steps (new []))
    let next = __x1__
    app __x2__ = (WrapCompletion (new Record("Iterator" -> iterator, "NextMethod" -> next, "Done" -> false)))
    return __x2__
  }""")
}
