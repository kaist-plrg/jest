package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration0InstantiateFunctionObject0 extends Algorithm {
  val name: String = "FunctionDeclaration0InstantiateFunctionObject0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, FunctionBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    !!! "Let id:{F} be OrdinaryFunctionCreate ( % Function . prototype % , nt:{FormalParameters} , nt:{FunctionBody} , const:{non-lexical-this} , id:{scope} ) ."
    app __x1__ = (MakeConstructor F)
    __x1__
    app __x2__ = (SetFunctionName F name)
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }"""), this)
}
