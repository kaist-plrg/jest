package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncFunctionStart extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.AsyncFunctionStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promiseCapability = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let asyncFunctionBody = __x1__
    let runningContext = GLOBAL_context
    let asyncContext = (copy-obj runningContext)
    asyncContext["ResumeCont"] = () [=>] {
      access __x2__ = (asyncFunctionBody "Evaluation")
      let result = __x2__
      access __ret__ = (asyncContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
        __x3__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x3__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      if (= result["Type"] CONST_normal) {
        app __x4__ = (Call promiseCapability["Resolve"] undefined (new [undefined]))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      } else if (= result["Type"] CONST_return) {
        app __x5__ = (Call promiseCapability["Resolve"] undefined (new [result["Value"]]))
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      } else {
        assert (= result["Type"] CONST_throw)
        app __x6__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
      }
      app __x7__ = (NormalCompletion undefined)
      return __x7__
    }
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x8__ (result) ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x8__ -> asyncContext["ReturnCont"]
      app __x9__ = (asyncContext["ResumeCont"] )
    }
    app __x10__ = (NormalCompletion undefined)
    return __x10__
  }"""))
}
