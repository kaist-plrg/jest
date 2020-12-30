package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorResume extends Algorithm {
  val name: String = "GeneratorResume"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorResume" (generator, value) => {
    app __x0__ = (GeneratorValidate generator)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state CONST_completed) {
      app __x1__ = (CreateIterResultObject undefined true)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    assert (|| (= state CONST_suspendedStart) (= state CONST_suspendedYield))
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    generator["GeneratorState"] = CONST_executing
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x3__ = (NormalCompletion value)
    withcont __x4__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x4__ -> genContext["ReturnCont"]
      app __x5__ = (genContext["ResumeCont"] __x3__)
    }
    app __x6__ = (Completion result)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
