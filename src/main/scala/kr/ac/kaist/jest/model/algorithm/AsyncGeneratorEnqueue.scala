package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncGeneratorEnqueue extends Algorithm {
  val name: String = "AsyncGeneratorEnqueue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorEnqueue" (generator, completion) => {
    assert (is-completion completion)
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (Type generator)
    if (|| (! (= __x1__ Object)) (= generator["AsyncGeneratorState"] absent)) {
      let badGeneratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [badGeneratorError]))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion promiseCapability["Promise"])
      return __x3__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    let request = (new AsyncGeneratorRequest("Completion" -> completion, "Capability" -> promiseCapability))
    append request -> queue
    let state = generator["AsyncGeneratorState"]
    if (! (= state CONST_executing)) {
      app __x4__ = (AsyncGeneratorResumeNext generator)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
    } else {}
    app __x5__ = (WrapCompletion promiseCapability["Promise"])
    return __x5__
  }"""), this)
}
