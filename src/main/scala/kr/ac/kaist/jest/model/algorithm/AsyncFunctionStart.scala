package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFunctionStart extends Algorithm {
  val name: String = "AsyncFunctionStart"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionStart" (promiseCapability, asyncFunctionBody) => {
    let runningContext = GLOBAL_context
    let asyncContext = (copy-obj runningContext)
    asyncContext["ResumeCont"] = () [=>] {
      access __x0__ = (asyncFunctionBody "Evaluation")
      let result = __x0__
      access __ret__ = (asyncContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
        __x1__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x1__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      if (= result["Type"] CONST_normal) {
        app __x2__ = (Call promiseCapability["Resolve"] undefined (new [undefined]))
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        __x2__
      } else if (= result["Type"] CONST_return) {
        app __x3__ = (Call promiseCapability["Resolve"] undefined (new [result["Value"]]))
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
      } else {
        assert (= result["Type"] CONST_throw)
        app __x4__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      }
      app __x5__ = (NormalCompletion undefined)
      app __x6__ = (__ret__ __x5__)
    }
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x7__ (result) ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x7__ -> asyncContext["ReturnCont"]
      app __x8__ = (asyncContext["ResumeCont"] )
    }
    app __x9__ = (NormalCompletion undefined)
    return __x9__
  }"""), this)
}
