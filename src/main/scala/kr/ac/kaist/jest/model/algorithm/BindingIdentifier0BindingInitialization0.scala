package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingIdentifier0BindingInitialization0 extends Algorithm {
  val name: String = "BindingIdentifier0BindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingIdentifier0BindingInitialization0" (this, Identifier, value, environment) => {
    access __x0__ = (Identifier "StringValue")
    let name = __x0__
    app __x1__ = (InitializeBoundName name value environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
