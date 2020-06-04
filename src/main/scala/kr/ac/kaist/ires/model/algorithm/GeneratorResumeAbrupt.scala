package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorResumeAbrupt extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""GeneratorResumeAbrupt" (generator, abruptCompletion) => {
    app __x0__ = (GeneratorValidate generator)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state "suspendedStart") {
      generator["GeneratorState"] = "completed"
      state = "completed"
    } else {}
    if (= state "completed") {
      if (= abruptCompletion["Type"] CONST_return) {
        app __x1__ = (CreateIterResultObject abruptCompletion["Value"] true)
        app __x2__ = (WrapCompletion __x1__)
        return __x2__
      } else {}
      app __x3__ = (Completion abruptCompletion)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    assert (= state "suspendedYield")
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x5__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x5__ -> genContext["ReturnCont"]
      app __x6__ = (genContext["ResumeCont"] abruptCompletion)
    }
    app __x7__ = (Completion result)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
