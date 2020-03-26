package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrepareForOrdinaryCall {
  val length: Int = 2
  val func: Func = Func("""PrepareForOrdinaryCall""", List(Id("""F"""), Id("""newTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""newTarget"""))))), IAssert(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Undefined""")))), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))))), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""calleeContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Function""")), ERef(RefId(Id("""F""")))), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Realm""")), ERef(RefId(Id("""calleeRealm""")))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewFunctionEnvironment"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))), ILet(Id("""localEnv"""), ERef(RefId(Id("""__x1__""")))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""localEnv""")))), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""localEnv""")))), IIf(EBOp(OEq, ERef(RefId(Id("""callerContext"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull), IAssign(RefId(Id("""callerContext""")), ENull))), ISeq(List())), IAppend(ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""calleeContext"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "PrepareForOrdinaryCall" (F, newTarget) => {
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
    if (= callerContext null) {
      GLOBAL_context = null
      callerContext = null
    } else {}
    append calleeContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x2__ = (WrapCompletion calleeContext)
    return __x2__
  }
  */
}
