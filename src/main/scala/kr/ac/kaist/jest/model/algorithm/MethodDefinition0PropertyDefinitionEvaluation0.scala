package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MethodDefinition0PropertyDefinitionEvaluation0 extends Algorithm {
  val name: String = "MethodDefinition0PropertyDefinitionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MethodDefinition0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, enumerable) => {
    access __x0__ = (this "DefineMethod")
    app __x1__ = (__x0__ object)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let methodDef = __x1__
    app __x2__ = (SetFunctionName methodDef["Closure"] methodDef["Key"])
    __x2__
    let desc = (new PropertyDescriptor("Value" -> methodDef["Closure"], "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x3__ = (DefinePropertyOrThrow object methodDef["Key"] desc)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
