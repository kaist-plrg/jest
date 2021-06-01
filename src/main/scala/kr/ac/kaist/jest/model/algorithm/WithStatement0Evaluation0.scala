package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object WithStatement0Evaluation0 extends Algorithm {
  val name: String = "WithStatement0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""WithStatement0Evaluation0" (this, Expression, Statement) => {
    access __x0__ = (Expression "Evaluation")
    let val = __x0__
    app __x1__ = (GetValue val)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToObject __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let obj = __x2__
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x3__ = (NewObjectEnvironment obj oldEnv)
    let newEnv = __x3__
    newEnv["EnvironmentRecord"]["withEnvironment"] = true
    GLOBAL_context["LexicalEnvironment"] = newEnv
    access __x4__ = (Statement "Evaluation")
    let C = __x4__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x5__ = (UpdateEmpty C undefined)
    app __x6__ = (Completion __x5__)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
