package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ECMAScriptFunctionObjectDOTCall extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""ECMAScriptFunctionObject.Call" (F, thisArgument, argumentsList) => {
    if (= F["FunctionKind"] "classConstructor") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let callerContext = GLOBAL_context
    app __x1__ = (PrepareForOrdinaryCall F undefined)
    let calleeContext = __x1__
    app __x2__ = (OrdinaryCallBindThis F calleeContext thisArgument)
    __x2__
    app __x3__ = (OrdinaryCallEvaluateBody F argumentsList)
    let result = __x3__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x4__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x4__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    if (= result["Type"] CONST_return) {
      app __x5__ = (NormalCompletion result["Value"])
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else return result else {}
    result
    app __x7__ = (NormalCompletion undefined)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
