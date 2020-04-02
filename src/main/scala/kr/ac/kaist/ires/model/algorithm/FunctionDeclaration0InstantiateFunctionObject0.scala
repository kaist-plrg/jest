package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = parseFunc(""""FunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, FunctionBody, scope) => {
    if true let strict = true else let strict = false
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope strict)
    let F = __x1__
    app __x2__ = (MakeConstructor F)
    __x2__
    app __x3__ = (SetFunctionName F name)
    __x3__
    F["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion F)
    return __x4__
  }""")
}
