package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrepareForOrdinaryCall extends Algorithm {
  val name: String = "PrepareForOrdinaryCall"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrepareForOrdinaryCall" (F, newTarget) => {
    app __x0__ = (Type newTarget)
    assert (|| (= __x0__ Undefined) (= __x0__ Object))
    let callerContext = GLOBAL_context
    let calleeContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    calleeContext["Function"] = F
    let calleeRealm = F["Realm"]
    calleeContext["Realm"] = calleeRealm
    calleeContext["ScriptOrModule"] = F["ScriptOrModule"]
    app __x1__ = (NewFunctionEnvironment F newTarget)
    let localEnv = __x1__
    calleeContext["LexicalEnvironment"] = localEnv
    calleeContext["VariableEnvironment"] = localEnv
    if (= callerContext null) {} else {}
    append calleeContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x2__ = (WrapCompletion calleeContext)
    return __x2__
  }"""), this)
}
