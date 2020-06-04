package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition0PropertyDefinitionEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""MethodDefinition0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, enumerable) => {
    access __x0__ = (this "DefineMethod")
    app __x1__ = (__x0__ object)
    let methodDef = __x1__
    if (is-completion methodDef) if (= methodDef["Type"] CONST_normal) methodDef = methodDef["Value"] else return methodDef else {}
    methodDef
    app __x2__ = (SetFunctionName methodDef["Closure"] methodDef["Key"])
    __x2__
    let desc = (new PropertyDescriptor("Value" -> methodDef["Closure"], "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x3__ = (DefinePropertyOrThrow object methodDef["Key"] desc)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
