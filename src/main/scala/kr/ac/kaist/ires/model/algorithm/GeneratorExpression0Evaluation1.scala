package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = parseFunc(""""GeneratorExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, GeneratorBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    app __x3__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody funcEnv)
    let closure = __x3__
    app __x4__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x4__
    app __x5__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x5__
    app __x6__ = (SetFunctionName closure name)
    __x6__
    app __x7__ = (envRec["InitializeBinding"] envRec name closure)
    __x7__
    closure["SourceText"] = (get-syntax this)
    app __x8__ = (WrapCompletion closure)
    return __x8__
  }""")
}
