package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AwaitRejectedFunctions {
  val length: Int = 0
  val func: Func = parseFunc(""""AwaitRejectedFunctions" () => {
    let F = GLOBAL_context["Function"]
    let asyncContext = F["AsyncContext"]
    let prevContext = GLOBAL_context
    GLOBAL_context = null
    prevContext = null
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x0__ = (ThrowCompletion reason)
    withcont __x1__ () ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x1__ -> asyncContext["ReturnCont"]
      app __x2__ = (asyncContext["ResumeCont"] __x0__)
    }
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }""")
}