package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformEval extends Algorithm {
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""PerformEval" (x, evalRealm, strictCaller, direct) => {
    app __x0__ = (Type x)
    if (! (= __x0__ String)) {
      app __x1__ = (WrapCompletion x)
      return __x1__
    } else {}
    app __x2__ = (GetThisEnvironment )
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let thisEnvRec = __x2__
    if (= (typeof thisEnvRec) "FunctionEnvironmentRecord") {
      let F = thisEnvRec["FunctionObject"]
      let inFunction = true
      app __x3__ = (thisEnvRec["HasSuperBinding"] thisEnvRec)
      let inMethod = __x3__
      if (= F["ConstructorKind"] "derived") let inDerivedConstructor = true else let inDerivedConstructor = false
    } else {
      let inFunction = false
      let inMethod = false
      let inDerivedConstructor = false
    }
    let __x4__ = (parse-syntax x "Script" )
    if (= __x4__ absent) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    let script = __x4__
    access __x6__ = (script "Contains")
    app __x7__ = (__x6__ "ScriptBody")
    if (= __x7__ false) {
      app __x8__ = (WrapCompletion undefined)
      return __x8__
    } else {}
    access __x9__ = (script "ScriptBody")
    let body = __x9__
    if (= strictCaller true) let strictEval = true else {
      access __x10__ = (script "IsStrict")
      let strictEval = __x10__
    }
    let ctx = GLOBAL_context
    if (= direct true) {
      app __x11__ = (NewDeclarativeEnvironment ctx["LexicalEnvironment"])
      let lexEnv = __x11__
      let varEnv = ctx["VariableEnvironment"]
    } else {
      app __x12__ = (NewDeclarativeEnvironment evalRealm["GlobalEnv"])
      let lexEnv = __x12__
      let varEnv = evalRealm["GlobalEnv"]
    }
    if (= strictEval true) varEnv = lexEnv else {}
    if (= ctx null) {} else {}
    let evalCxt = (new ExecutionContext("SubMap" -> (new SubMap())))
    evalCxt["Function"] = null
    evalCxt["Realm"] = evalRealm
    evalCxt["ScriptOrModule"] = ctx["ScriptOrModule"]
    evalCxt["VariableEnvironment"] = varEnv
    evalCxt["LexicalEnvironment"] = lexEnv
    append evalCxt -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x13__ = (EvalDeclarationInstantiation body varEnv lexEnv strictEval)
    let result = __x13__
    if (= result["Type"] CONST_normal) {
      access __x14__ = (body "Evaluation")
      result = __x14__
    } else {}
    if (&& (= result["Type"] CONST_normal) (= result["Value"] CONST_empty)) {
      app __x15__ = (NormalCompletion undefined)
      result = __x15__
    } else {}
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] evalCxt) {
      __x16__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x16__)
      if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    } else GLOBAL_context = null
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x17__ = (Completion result)
    app __x18__ = (WrapCompletion __x17__)
    return __x18__
  }"""))
}
