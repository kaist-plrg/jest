package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFunctionBody0EvaluateBody0 extends Algorithm {
  val name: String = "AsyncFunctionBody0EvaluateBody0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionBody0EvaluateBody0" (this, FunctionBody, functionObject, argumentsList) => {
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    let declResult = __x1__
    app __x2__ = (IsAbruptCompletion declResult)
    if (! __x2__) {
      app __x3__ = (AsyncFunctionStart promiseCapability FunctionBody)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {
      app __x4__ = (Call promiseCapability["Reject"] undefined (new [declResult["Value"]]))
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    }
    app __x5__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> promiseCapability["Promise"], "Target" -> CONST_empty)))
    return __x5__
  }"""), this)
}
