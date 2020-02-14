package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionInitialize {
  val length: Int = 5
  val func: Func = Func("""FunctionInitialize""", List(Id("""F"""), Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ParameterList"""))), EStr("""ExpectedArgumentCount""")), ILet(Id("""len"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionLength"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""len"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x1__""")))), IIf(EBool(true), ILet(Id("""Strict"""), EBool(true)), ILet(Id("""Strict"""), EBool(false))), IAssign(RefProp(RefId(Id("""F""")), EStr("""Strict""")), ERef(RefId(Id("""Strict""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""Environment""")), ERef(RefId(Id("""Scope""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""FormalParameters""")), ERef(RefId(Id("""ParameterList""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""ECMAScriptCode""")), ERef(RefId(Id("""Body""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetActiveScriptOrModule"""))), List()), IAssign(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")), ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""CONST_Arrow""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")), ERef(RefId(Id("""CONST_lexical""")))), IIf(EBOp(OEq, ERef(RefId(Id("""Strict"""))), EBool(true)), IAssign(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")), ERef(RefId(Id("""CONST_strict""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")), ERef(RefId(Id("""CONST_global""")))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "FunctionInitialize" (F, kind, ParameterList, Body, Scope) => {
    access __x0__ = (ParameterList "ExpectedArgumentCount")
    let len = __x0__
    app __x1__ = (SetFunctionLength F len)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    if true let Strict = true else let Strict = false
    F["Strict"] = Strict
    F["Environment"] = Scope
    F["FormalParameters"] = ParameterList
    F["ECMAScriptCode"] = Body
    app __x2__ = (GetActiveScriptOrModule )
    F["ScriptOrModule"] = __x2__
    if (= kind CONST_Arrow) F["ThisMode"] = CONST_lexical else if (= Strict true) F["ThisMode"] = CONST_strict else F["ThisMode"] = CONST_global
    app __x3__ = (WrapCompletion F)
    return __x3__
  }
  */
}
