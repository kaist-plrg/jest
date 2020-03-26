package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptEvaluation {
  val length: Int = 1
  val func: Func = Func("""ScriptEvaluation""", List(Id("""scriptRecord""")), None, ISeq(List(ILet(Id("""globalEnv"""), ERef(RefProp(RefProp(RefId(Id("""scriptRecord""")), EStr("""Realm""")), EStr("""GlobalEnv""")))), ILet(Id("""scriptCxt"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""Function""")), ENull), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""Realm""")), ERef(RefProp(RefId(Id("""scriptRecord""")), EStr("""Realm""")))), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""ScriptOrModule""")), ERef(RefId(Id("""scriptRecord""")))), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""globalEnv""")))), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""globalEnv""")))), IAssign(RefId(Id("""GLOBAL_context""")), ENull), IAppend(ERef(RefId(Id("""scriptCxt"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), ILet(Id("""scriptBody"""), ERef(RefProp(RefId(Id("""scriptRecord""")), EStr("""ECMAScriptCode""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""GlobalDeclarationInstantiation"""))), List(ERef(RefId(Id("""scriptBody"""))), ERef(RefId(Id("""globalEnv"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""scriptBody"""))), EStr("""Evaluation""")), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ENull), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""scriptCxt""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))))), ISeq(List())), IAssert(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "ScriptEvaluation" (scriptRecord) => {
    let globalEnv = scriptRecord["Realm"]["GlobalEnv"]
    let scriptCxt = (new ExecutionContext("SubMap" -> (new SubMap())))
    scriptCxt["Function"] = null
    scriptCxt["Realm"] = scriptRecord["Realm"]
    scriptCxt["ScriptOrModule"] = scriptRecord
    scriptCxt["VariableEnvironment"] = globalEnv
    scriptCxt["LexicalEnvironment"] = globalEnv
    GLOBAL_context = null
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
    GLOBAL_context = null
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] scriptCxt) {
      __x3__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x3__)
    } else {}
    assert (< 0i GLOBAL_executionStack["length"])
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x4__ = (Completion result)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
