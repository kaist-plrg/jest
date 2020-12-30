package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionDeclaration0InstantiateFunctionObject0 extends Algorithm {
  val name: String = "FunctionDeclaration0InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, FunctionBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app F = (OrdinaryFunctionCreate INTRINSIC_FunctionPrototype FormalParameters FunctionBody CONST_nonlexicalthis scope)
    app __x1__ = (MakeConstructor F)
    __x1__
    app __x2__ = (SetFunctionName F name)
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }"""), this)
}
