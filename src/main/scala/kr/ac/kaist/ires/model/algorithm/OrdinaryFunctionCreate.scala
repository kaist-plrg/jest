package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryFunctionCreate extends Algorithm {
  val name: String = "OrdinaryFunctionCreate"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryFunctionCreate" (functionPrototype, ParameterList, Body, thisMode, Scope) => {
    app __x0__ = (Type functionPrototype)
    assert (= __x0__ Object)
    !!! "Let id:{internalSlotsList} be the internal slots listed in Table 27 ."
    app __x1__ = (OrdinaryObjectCreate functionPrototype internalSlotsList)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let F = __x1__
    F["Call"] = ECMAScriptFunctionObjectDOTCall
    F["FormalParameters"] = ParameterList
    F["ECMAScriptCode"] = Body
    if true let Strict = true else let Strict = false
    F["Strict"] = Strict
    if (= thisMode CONST_lexicalthis) F["ThisMode"] = CONST_lexical else if (= Strict true) F["ThisMode"] = CONST_strict else F["ThisMode"] = CONST_global
    F["IsClassConstructor"] = false
    F["Environment"] = Scope
    app __x2__ = (GetActiveScriptOrModule )
    F["ScriptOrModule"] = __x2__
    F["Realm"] = REALM
    F["HomeObject"] = undefined
    access __x3__ = (ParameterList "ExpectedArgumentCount")
    let len = __x3__
    app __x4__ = (SetFunctionLength F len)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    app __x5__ = (WrapCompletion F)
    return __x5__
  }"""), this)
}
