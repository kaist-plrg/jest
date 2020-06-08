package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BuiltinFunctionObjectDOTCall extends Algorithm {
  val name: String = "BuiltinFunctionObjectDOTCall"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BuiltinFunctionObject.Call" (F, thisArgument, argumentsList) => {
    let callerContext = GLOBAL_context
    if (= callerContext null) {} else {}
    let calleeContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    calleeContext["Function"] = F
    let calleeRealm = F["Realm"]
    calleeContext["Realm"] = calleeRealm
    calleeContext["ScriptOrModule"] = F["ScriptOrModule"]
    app localEnv = (NewFunctionEnvironment F undefined)
    calleeContext["LexicalEnvironment"] = localEnv
    calleeContext["VariableEnvironment"] = localEnv
    append calleeContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    !!! "Let id:{result} be the Completion Record that is the result of evaluating id:{F} in a manner that conforms to the specification of id:{F} . id:{thisArgument} is the value:{this} value , id:{argumentsList} provides the named parameters , and the NewTarget value is value:{undefined} ."
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x0__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x0__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x1__ = (WrapCompletion result)
    return __x1__
  }"""), this)
}
