package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeHostDefinedRealm {
  val length: Int = 0
  val func: Func = Func("""InitializeHostDefinedRealm""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateRealm"""))), List()), ILet(Id("""realm"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""newContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Function""")), ENull), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Realm""")), ERef(RefId(Id("""realm""")))), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""ScriptOrModule""")), ENull), IAppend(ERef(RefId(Id("""newContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), ILet(Id("""global"""), EUndef), ILet(Id("""thisValue"""), EUndef), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetRealmGlobalObject"""))), List(ERef(RefId(Id("""realm"""))), ERef(RefId(Id("""global"""))), ERef(RefId(Id("""thisValue"""))))), IExpr(ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetDefaultGlobalBindings"""))), List(ERef(RefId(Id("""realm"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""globalObj"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))))
  /* Beautified form:
  "InitializeHostDefinedRealm" () => {
    app __x0__ = (CreateRealm )
    let realm = __x0__
    let newContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    newContext["Function"] = null
    newContext["Realm"] = realm
    newContext["ScriptOrModule"] = null
    append newContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    let global = undefined
    let thisValue = undefined
    app __x1__ = (SetRealmGlobalObject realm global thisValue)
    __x1__
    app __x2__ = (SetDefaultGlobalBindings realm)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let globalObj = __x2__
    app __x3__ = (NormalCompletion CONST_empty)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
