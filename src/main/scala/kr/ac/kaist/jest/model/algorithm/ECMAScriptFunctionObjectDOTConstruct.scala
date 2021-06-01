package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ECMAScriptFunctionObjectDOTConstruct extends Algorithm {
  val name: String = "ECMAScriptFunctionObjectDOTConstruct"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ECMAScriptFunctionObject.Construct" (F, argumentsList, newTarget) => {
    app __x0__ = (Type newTarget)
    assert (= __x0__ Object)
    let callerContext = GLOBAL_context
    let kind = F["ConstructorKind"]
    if (= kind CONST_base) {
      app __x1__ = (OrdinaryCreateFromConstructor newTarget "%Object.prototype%")
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let thisArgument = __x1__
    } else {}
    app __x2__ = (PrepareForOrdinaryCall F newTarget)
    let calleeContext = __x2__
    if (= kind CONST_base) {
      app __x3__ = (OrdinaryCallBindThis F calleeContext thisArgument)
      __x3__
    } else {}
    access __x4__ = (calleeContext "LexicalEnvironment")
    let constructorEnv = __x4__
    let envRec = constructorEnv["EnvironmentRecord"]
    app __x5__ = (OrdinaryCallEvaluateBody F argumentsList)
    let result = __x5__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x6__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x6__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    if (= result["Type"] CONST_return) {
      app __x7__ = (Type result["Value"])
      if (= __x7__ Object) {
        app __x8__ = (NormalCompletion result["Value"])
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      if (= kind CONST_base) {
        app __x10__ = (NormalCompletion thisArgument)
        app __x11__ = (WrapCompletion __x10__)
        return __x11__
      } else {}
      if (! (= result["Value"] undefined)) {
        app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x12__
      } else {}
    } else {
      if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else return result else {}
      result
    }
    app __x13__ = (envRec["GetThisBinding"] envRec)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }"""), this)
}
