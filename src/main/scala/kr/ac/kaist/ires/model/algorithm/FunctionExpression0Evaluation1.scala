package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0Evaluation1 extends Algorithm {
  val name: String = "FunctionExpression0Evaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    !!! "Let id:{closure} be OrdinaryFunctionCreate ( % Function . prototype % , nt:{FormalParameters} , nt:{FunctionBody} , const:{non-lexical-this} , id:{funcEnv} ) ."
    app __x3__ = (MakeConstructor closure)
    __x3__
    app __x4__ = (SetFunctionName closure name)
    __x4__
    closure["SourceText"] = (get-syntax this)
    app __x5__ = (envRec["InitializeBinding"] envRec name closure)
    __x5__
    app __x6__ = (WrapCompletion closure)
    return __x6__
  }"""), this)
}
