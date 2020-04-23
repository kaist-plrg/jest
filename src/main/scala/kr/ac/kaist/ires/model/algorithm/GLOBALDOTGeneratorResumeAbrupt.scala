package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorResumeAbrupt {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.GeneratorResumeAbrupt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let abruptCompletion = __x1__
    app __x2__ = (GeneratorValidate generator)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let state = __x2__
    if (= state "suspendedStart") {
      generator["GeneratorState"] = "completed"
      state = "completed"
    } else {}
    if (= state "completed") {
      if (= abruptCompletion["Type"] CONST_return) {
        app __x3__ = (CreateIterResultObject abruptCompletion["Value"] true)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      app __x5__ = (Completion abruptCompletion)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    assert (= state "suspendedYield")
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x7__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x7__ -> genContext["ReturnCont"]
      app __x8__ = (genContext["ResumeCont"] abruptCompletion)
    }
    app __x9__ = (Completion result)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }""")
}
