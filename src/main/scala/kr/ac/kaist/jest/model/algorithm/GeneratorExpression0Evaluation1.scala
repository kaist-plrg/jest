package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorExpression0Evaluation1 extends Algorithm {
  val name: String = "GeneratorExpression0Evaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, GeneratorBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    app __x3__ = (OrdinaryFunctionCreate INTRINSIC_Generator FormalParameters GeneratorBody CONST_nonlexicalthis funcEnv)
    let closure = __x3__
    app prototype = (OrdinaryObjectCreate INTRINSIC_GeneratorPrototype)
    app __x4__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x4__
    app __x5__ = (SetFunctionName closure name)
    __x5__
    app __x6__ = (envRec["InitializeBinding"] envRec name closure)
    __x6__
    closure["SourceText"] = (get-syntax this)
    app __x7__ = (WrapCompletion closure)
    return __x7__
  }"""), this)
}
