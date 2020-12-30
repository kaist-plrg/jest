package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MethodDefinition5PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "MethodDefinition5PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition5PropertyDefinitionEvaluation0" (this, PropertyName, PropertySetParameterList, FunctionBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (is-completion propKey) if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    app closure = (OrdinaryFunctionCreate INTRINSIC_FunctionPrototype PropertySetParameterList FunctionBody CONST_nonlexicalthis scope)
    app __x1__ = (MakeMethod closure object)
    __x1__
    app __x2__ = (SetFunctionName closure propKey "set")
    __x2__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Set" -> closure, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x3__ = (DefinePropertyOrThrow object propKey desc)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
