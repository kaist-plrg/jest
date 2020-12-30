package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PerformEval extends Algorithm {
  val name: String = "PerformEval"
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""PerformEval" (x, callerRealm, strictCaller, direct) => {
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
      if (= F["ConstructorKind"] CONST_derived) let inDerivedConstructor = true else let inDerivedConstructor = false
    } else {
      let inFunction = false
      let inMethod = false
      let inDerivedConstructor = false
    }
    let script = (parse-syntax x "Script" (new []))
    if (= script absent) {
      app error = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return error
    } else {}
    access __x5__ = (script "Contains")
    app __x6__ = (__x5__ "ScriptBody")
    if (= __x6__ false) {
      app __x7__ = (WrapCompletion undefined)
      return __x7__
    } else {}
    access __x8__ = (script "ScriptBody")
    let body = __x8__
    let __x9__ = (= inFunction false)
    if __x9__ {
      access __x10__ = (body "Contains")
      app __x11__ = (__x10__ "NewTarget")
      __x9__ = __x11__
    } else {}
    if __x9__ {
      app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x12__
    } else {}
    let __x13__ = (= inMethod false)
    if __x13__ {
      access __x14__ = (body "Contains")
      app __x15__ = (__x14__ "SuperProperty")
      __x13__ = __x15__
    } else {}
    if __x13__ {
      app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x16__
    } else {}
    let __x17__ = (= inDerivedConstructor false)
    if __x17__ {
      access __x18__ = (body "Contains")
      app __x19__ = (__x18__ "SuperCall")
      __x17__ = __x19__
    } else {}
    if __x17__ {
      app __x20__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x20__
    } else {}
    if (= strictCaller true) let strictEval = true else {
      access __x21__ = (script "IsStrict")
      let strictEval = __x21__
    }
    let runningContext = GLOBAL_context
    if (= direct true) {
      app __x22__ = (NewDeclarativeEnvironment runningContext["LexicalEnvironment"])
      let lexEnv = __x22__
      let varEnv = runningContext["VariableEnvironment"]
    } else {
      app __x23__ = (NewDeclarativeEnvironment evalRealm["GlobalEnv"])
      let lexEnv = __x23__
      let varEnv = evalRealm["GlobalEnv"]
    }
    if (= strictEval true) varEnv = lexEnv else {}
    if (= runningContext null) {} else {}
    let evalContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    evalContext["Function"] = null
    evalContext["Realm"] = evalRealm
    evalContext["ScriptOrModule"] = runningContext["ScriptOrModule"]
    evalContext["VariableEnvironment"] = varEnv
    evalContext["LexicalEnvironment"] = lexEnv
    append evalContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x24__ = (EvalDeclarationInstantiation body varEnv lexEnv strictEval)
    let result = __x24__
    if (= result["Type"] CONST_normal) {
      access __x25__ = (body "Evaluation")
      result = __x25__
    } else {}
    if (&& (= result["Type"] CONST_normal) (= result["Value"] CONST_empty)) {
      app __x26__ = (NormalCompletion undefined)
      result = __x26__
    } else {}
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] evalContext) {
      __x27__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x27__)
      if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    } else GLOBAL_context = null
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x28__ = (Completion result)
    app __x29__ = (WrapCompletion __x28__)
    return __x29__
  }"""), this)
}
