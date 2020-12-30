package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorMethod0PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "GeneratorMethod0PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, GeneratorBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x1__ = (OrdinaryFunctionCreate INTRINSIC_Generator UniqueFormalParameters GeneratorBody CONST_nonlexicalthis scope)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    app prototype = (OrdinaryObjectCreate INTRINSIC_GeneratorPrototype)
    app __x3__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x3__
    app __x4__ = (SetFunctionName closure propKey)
    __x4__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x5__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
