package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SwitchStatement0Evaluation0 extends Algorithm {
  val name: String = "SwitchStatement0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SwitchStatement0Evaluation0" (this, Expression, CaseBlock) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let switchValue = __x1__
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x2__ = (NewDeclarativeEnvironment oldEnv)
    let blockEnv = __x2__
    app __x3__ = (BlockDeclarationInstantiation CaseBlock blockEnv)
    __x3__
    GLOBAL_context["LexicalEnvironment"] = blockEnv
    access __x4__ = (CaseBlock "CaseBlockEvaluation")
    app __x5__ = (__x4__ switchValue)
    let R = __x5__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x6__ = (WrapCompletion R)
    return __x6__
  }"""), this)
}
