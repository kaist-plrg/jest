package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorResume extends Algorithm {
  val name: String = "GLOBALDOTGeneratorResume"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.GeneratorResume" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    app __x2__ = (GeneratorValidate generator)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let state = __x2__
    if (= state CONST_completed) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    assert (|| (= state CONST_suspendedStart) (= state CONST_suspendedYield))
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    generator["GeneratorState"] = CONST_executing
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x5__ = (NormalCompletion value)
    withcont __x6__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x6__ -> genContext["ReturnCont"]
      app __x7__ = (genContext["ResumeCont"] __x5__)
    }
    app __x8__ = (Completion result)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
