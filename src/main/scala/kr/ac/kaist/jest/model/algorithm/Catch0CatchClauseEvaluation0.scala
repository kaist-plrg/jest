package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Catch0CatchClauseEvaluation0 extends Algorithm {
  val name: String = "Catch0CatchClauseEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Catch0CatchClauseEvaluation0" (this, CatchParameter, Block, thrownValue) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let catchEnv = __x0__
    let catchEnvRec = catchEnv["EnvironmentRecord"]
    access __x1__ = (CatchParameter "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let argName = __x2__[__x3__]
      app __x4__ = (catchEnvRec["CreateMutableBinding"] catchEnvRec argName false)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      __x3__ = (+ __x3__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = catchEnv
    access __x5__ = (CatchParameter "BindingInitialization")
    app __x6__ = (__x5__ thrownValue catchEnv)
    let status = __x6__
    app __x7__ = (IsAbruptCompletion status)
    if __x7__ {
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x8__ = (Completion status)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    access __x10__ = (Block "Evaluation")
    let B = __x10__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x11__ = (Completion B)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }"""), this)
}
