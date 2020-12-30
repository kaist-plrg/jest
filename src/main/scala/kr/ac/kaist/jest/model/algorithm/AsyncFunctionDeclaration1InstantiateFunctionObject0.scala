package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFunctionDeclaration1InstantiateFunctionObject0 extends Algorithm {
  val name: String = "AsyncFunctionDeclaration1InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, AsyncFunctionBody, scope) => {
    app F = (OrdinaryFunctionCreate INTRINSIC_AsyncFunctionPrototype FormalParameters AsyncFunctionBody CONST_nonlexicalthis scope)
    ! F
    app __x0__ = (SetFunctionName F "default")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    F["SourceText"] = (get-syntax this)
    app __x1__ = (WrapCompletion F)
    return __x1__
  }"""), this)
}
