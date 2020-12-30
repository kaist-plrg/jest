package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object InitializeHostDefinedRealm extends Algorithm {
  val name: String = "InitializeHostDefinedRealm"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""InitializeHostDefinedRealm" () => {
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
  }"""), this)
}
