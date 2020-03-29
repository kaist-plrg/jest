package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformEval {
  val length: Int = 4
  val func: Func = parseFunc(""""PerformEval" (x, callerRealm, strictCaller, direct) => {
    app __x0__ = (Type x)
    if (! (= __x0__ String)) {
      app __x1__ = (WrapCompletion x)
      return __x1__
    } else {}
    let evalRealm = REALM
    app __x2__ = (HostEnsureCanCompileStrings callerRealm evalRealm)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (GetThisEnvironment )
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let thisEnvRec = __x3__
    if (= (typeof thisEnvRec) "FunctionEnvironmentRecord") {
      let F = thisEnvRec["FunctionObject"]
      let inFunction = true
      app __x4__ = (thisEnvRec["HasSuperBinding"] thisEnvRec)
      let inMethod = __x4__
      if (= F["ConstructorKind"] "derived") let inDerivedConstructor = true else let inDerivedConstructor = false
    } else {
      let inFunction = false
      let inMethod = false
      let inDerivedConstructor = false
    }
    let __x5__ = (parse-syntax x "Script" )
    if (= __x5__ absent) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let script = __x5__
    access __x7__ = (script "Contains")
    app __x8__ = (__x7__ "ScriptBody")
    if (= __x8__ false) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {}
    access __x10__ = (script "ScriptBody")
    let body = __x10__
    let __x11__ = (= inFunction false)
    if __x11__ {
      access __x12__ = (body "Contains")
      app __x13__ = (__x12__ "NewTarget")
      __x11__ = __x13__
    } else {}
    if __x11__ {
      app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x14__
    } else {}
    let __x15__ = (= inMethod false)
    if __x15__ {
      access __x16__ = (body "Contains")
      app __x17__ = (__x16__ "SuperProperty")
      __x15__ = __x17__
    } else {}
    if __x15__ {
      app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x18__
    } else {}
    let __x19__ = (= inDerivedConstructor false)
    if __x19__ {
      access __x20__ = (body "Contains")
      app __x21__ = (__x20__ "SuperCall")
      __x19__ = __x21__
    } else {}
    if __x19__ {
      app __x22__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x22__
    } else {}
    if (= strictCaller true) let strictEval = true else {
      access __x23__ = (script "IsStrict")
      let strictEval = __x23__
    }
    let ctx = GLOBAL_context
    if (= direct true) {
      app __x24__ = (NewDeclarativeEnvironment ctx["LexicalEnvironment"])
      let lexEnv = __x24__
      let varEnv = ctx["VariableEnvironment"]
    } else {
      app __x25__ = (NewDeclarativeEnvironment evalRealm["GlobalEnv"])
      let lexEnv = __x25__
      let varEnv = evalRealm["GlobalEnv"]
    }
    if (= strictEval true) varEnv = lexEnv else {}
    if (= ctx null) {
      GLOBAL_context = null
      ctx = null
    } else {}
    let evalCxt = (new ExecutionContext("SubMap" -> (new SubMap())))
    evalCxt["Function"] = null
    evalCxt["Realm"] = evalRealm
    evalCxt["ScriptOrModule"] = ctx["ScriptOrModule"]
    evalCxt["VariableEnvironment"] = varEnv
    evalCxt["LexicalEnvironment"] = lexEnv
    append evalCxt -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x26__ = (EvalDeclarationInstantiation body varEnv lexEnv strictEval)
    let result = __x26__
    if (= result["Type"] CONST_normal) {
      access __x27__ = (body "Evaluation")
      result = __x27__
    } else {}
    if (&& (= result["Type"] CONST_normal) (= result["Value"] CONST_empty)) {
      app __x28__ = (NormalCompletion undefined)
      result = __x28__
    } else {}
    GLOBAL_context = null
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] evalCxt) {
      __x29__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x29__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x30__ = (Completion result)
    app __x31__ = (WrapCompletion __x30__)
    return __x31__
  }""")
}
