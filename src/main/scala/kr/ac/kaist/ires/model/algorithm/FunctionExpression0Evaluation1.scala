package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0Evaluation1 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FunctionExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    if true let strict = true else let strict = false
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    app __x3__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody funcEnv strict)
    let closure = __x3__
    app __x4__ = (MakeConstructor closure)
    __x4__
    app __x5__ = (SetFunctionName closure name)
    __x5__
    closure["SourceText"] = (get-syntax this)
    app __x6__ = (envRec["InitializeBinding"] envRec name closure)
    __x6__
    app __x7__ = (WrapCompletion closure)
    return __x7__
  }""")
}
