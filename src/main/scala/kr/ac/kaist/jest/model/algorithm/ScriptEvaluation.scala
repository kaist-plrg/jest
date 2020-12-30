package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ScriptEvaluation extends Algorithm {
  val name: String = "ScriptEvaluation"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ScriptEvaluation" (scriptRecord) => {
    let globalEnv = scriptRecord["Realm"]["GlobalEnv"]
    let scriptContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    scriptContext["Function"] = null
    scriptContext["Realm"] = scriptRecord["Realm"]
    scriptContext["ScriptOrModule"] = scriptRecord
    scriptContext["VariableEnvironment"] = globalEnv
    scriptContext["LexicalEnvironment"] = globalEnv
    append scriptContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    let scriptBody = scriptRecord["ECMAScriptCode"]
    app __x0__ = (GlobalDeclarationInstantiation scriptBody globalEnv)
    let result = __x0__
    if (= result["Type"] CONST_normal) {
      access __x1__ = (scriptBody "Evaluation")
      result = __x1__
    } else {}
    if (&& (= result["Type"] CONST_normal) (= result["Value"] CONST_empty)) {
      app __x2__ = (NormalCompletion undefined)
      result = __x2__
    } else {}
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] scriptContext) {
      __x3__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x3__)
      if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    } else GLOBAL_context = null
    assert (< 0i GLOBAL_executionStack["length"])
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x4__ = (Completion result)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
