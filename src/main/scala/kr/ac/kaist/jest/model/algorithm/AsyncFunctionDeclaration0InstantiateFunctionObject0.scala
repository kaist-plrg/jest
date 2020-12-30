package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFunctionDeclaration0InstantiateFunctionObject0 extends Algorithm {
  val name: String = "AsyncFunctionDeclaration0InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app F = (OrdinaryFunctionCreate INTRINSIC_AsyncFunctionPrototype FormalParameters AsyncFunctionBody CONST_nonlexicalthis scope)
    ! F
    app __x1__ = (SetFunctionName F name)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    F["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion F)
    return __x2__
  }"""), this)
}
