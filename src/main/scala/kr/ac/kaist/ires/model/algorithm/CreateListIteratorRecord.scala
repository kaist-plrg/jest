package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateListIteratorRecord {
  val length: Int = 1
  val func: Func = parseFunc(""""CreateListIteratorRecord" (list) => {
    app __x0__ = (ObjectCreate INTRINSIC_IteratorPrototype (new ["IteratedList", "ListIteratorNextIndex"]))
    let iterator = __x0__
    iterator["IteratedList"] = list
    iterator["ListIteratorNextIndex"] = 0i
    let steps = (new algorithm("name" -> "next", "length" -> 0i, "step" -> ListIteratornext))
    app __x1__ = (CreateBuiltinFunction steps (new []))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let next = __x1__
    app __x2__ = (WrapCompletion (new Record("Iterator" -> iterator, "NextMethod" -> next, "Done" -> false)))
    return __x2__
  }""")
}
