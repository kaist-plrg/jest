package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration1InstantiateFunctionObject0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, FunctionBody, scope) => {
    app __x0__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope true)
    let F = __x0__
    app __x1__ = (MakeConstructor F)
    __x1__
    app __x2__ = (SetFunctionName F "default")
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }""")
}
