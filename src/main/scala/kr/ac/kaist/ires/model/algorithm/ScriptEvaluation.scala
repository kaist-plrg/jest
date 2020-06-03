package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptEvaluation {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""ScriptEvaluation" (scriptRecord) => {
    let globalEnv = scriptRecord["Realm"]["GlobalEnv"]
    let scriptCxt = (new ExecutionContext("SubMap" -> (new SubMap())))
    scriptCxt["Function"] = null
    scriptCxt["Realm"] = scriptRecord["Realm"]
    scriptCxt["ScriptOrModule"] = scriptRecord
    scriptCxt["VariableEnvironment"] = globalEnv
    scriptCxt["LexicalEnvironment"] = globalEnv
    append scriptCxt -> GLOBAL_executionStack
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
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] scriptCxt) {
      __x3__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x3__)
      if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    } else GLOBAL_context = null
    assert (< 0i GLOBAL_executionStack["length"])
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x4__ = (Completion result)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }""")
}
