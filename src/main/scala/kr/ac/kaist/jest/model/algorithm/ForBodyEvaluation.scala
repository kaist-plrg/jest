package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForBodyEvaluation extends Algorithm {
  val name: String = "ForBodyEvaluation"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForBodyEvaluation" (test, increment, stmt, perIterationBindings, labelSet) => {
    let V = undefined
    app __x0__ = (CreatePerIterationEnvironment perIterationBindings)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    while true {
      if (! (= test absent)) {
        access __x1__ = (test "Evaluation")
        let testRef = __x1__
        app __x2__ = (GetValue testRef)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let testValue = __x2__
        app __x3__ = (ToBoolean testValue)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        if (= __x3__ false) {
          app __x4__ = (NormalCompletion V)
          app __x5__ = (WrapCompletion __x4__)
          return __x5__
        } else {}
      } else {}
      access __x6__ = (stmt "Evaluation")
      let result = __x6__
      app __x7__ = (LoopContinues result labelSet)
      if (= __x7__ false) {
        app __x8__ = (UpdateEmpty result V)
        app __x9__ = (Completion __x8__)
        app __x10__ = (WrapCompletion __x9__)
        return __x10__
      } else {}
      if (! (= result["Value"] CONST_empty)) V = result["Value"] else {}
      app __x11__ = (CreatePerIterationEnvironment perIterationBindings)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      if (! (= increment absent)) {
        access __x12__ = (increment "Evaluation")
        let incRef = __x12__
        app __x13__ = (GetValue incRef)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
      } else {}
    }
  }"""), this)
}
