package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LexicalBinding1Evaluation0 extends Algorithm {
  val name: String = "LexicalBinding1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LexicalBinding1Evaluation0" (this, BindingPattern, Initializer) => {
    access __x0__ = (Initializer "Evaluation")
    let rhs = __x0__
    app __x1__ = (GetValue rhs)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let value = __x1__
    let env = GLOBAL_context["LexicalEnvironment"]
    access __x2__ = (BindingPattern "BindingInitialization")
    app __x3__ = (__x2__ value env)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
