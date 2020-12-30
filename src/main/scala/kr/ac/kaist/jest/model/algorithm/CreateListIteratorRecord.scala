package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateListIteratorRecord extends Algorithm {
  val name: String = "CreateListIteratorRecord"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateListIteratorRecord" (list) => {
    app __x0__ = (OrdinaryObjectCreate INTRINSIC_IteratorPrototype (new ["IteratedList", "ListNextIndex"]))
    let iterator = __x0__
    iterator["IteratedList"] = list
    iterator["ListNextIndex"] = 0i
    let steps = (new algorithm("name" -> "next", "length" -> 0i, "step" -> ListIteratorNextFunctions))
    app __x1__ = (CreateBuiltinFunction steps (new []))
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let next = __x1__
    app __x2__ = (WrapCompletion (new Record("Iterator" -> iterator, "NextMethod" -> next, "Done" -> false)))
    return __x2__
  }"""), this)
}
