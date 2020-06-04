package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayAssignmentPattern0DestructuringAssignmentEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayAssignmentPattern0DestructuringAssignmentEvaluation0" (this, value) => {
    app __x0__ = (GetIterator value)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (IteratorClose iteratorRecord __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""))
}
