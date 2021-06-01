package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArgumentList3ArgumentListEvaluation0 extends Algorithm {
  val name: String = "ArgumentList3ArgumentListEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArgumentList3ArgumentListEvaluation0" (this, ArgumentList, AssignmentExpression) => {
    access __x0__ = (ArgumentList "ArgumentListEvaluation")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let precedingArgs = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x1__
    app __x2__ = (GetValue spreadRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (GetIterator __x2__)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorRecord = __x3__
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let next = __x4__
      if (= next false) {
        app __x5__ = (WrapCompletion precedingArgs)
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextArg = __x6__
      append nextArg -> precedingArgs
    }
  }"""), this)
}
