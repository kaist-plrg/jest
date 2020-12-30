package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionDeclaration1InstantiateFunctionObject0 extends Algorithm {
  val name: String = "FunctionDeclaration1InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, FunctionBody, scope) => {
    app F = (OrdinaryFunctionCreate INTRINSIC_FunctionPrototype FormalParameters FunctionBody CONST_nonlexicalthis scope)
    app __x0__ = (MakeConstructor F)
    __x0__
    app __x1__ = (SetFunctionName F "default")
    __x1__
    F["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion F)
    return __x2__
  }"""), this)
}
