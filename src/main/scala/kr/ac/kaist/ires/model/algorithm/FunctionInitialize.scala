package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionInitialize {
  val length: Int = 5
  val func: Func = parseFunc(""""FunctionInitialize" (F, kind, ParameterList, Body, Scope) => {
    access __x0__ = (ParameterList "ExpectedArgumentCount")
    let len = __x0__
    app __x1__ = (SetFunctionLength F len)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
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
  }""")
}
