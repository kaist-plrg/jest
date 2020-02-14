package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformEval {
  val length: Int = 4
  val func: Func = Func("""PerformEval""", List(Id("""x"""), Id("""callerRealm"""), Id("""strictCaller"""), Id("""direct""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""x"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), ILet(Id("""evalRealm"""), ERef(RefId(Id("""REALM""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""HostEnsureCanCompileStrings"""))), List(ERef(RefId(Id("""callerRealm"""))), ERef(RefId(Id("""evalRealm"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""thisEnvRec"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""thisEnvRec""")))), EStr("""FunctionEnvironmentRecord""")), ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""FunctionObject""")))), ILet(Id("""inFunction"""), EBool(true)), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""thisEnvRec""")), EStr("""HasSuperBinding"""))), List(ERef(RefId(Id("""thisEnvRec"""))))), ILet(Id("""inMethod"""), ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind"""))), EStr("""derived""")), ILet(Id("""inDerivedConstructor"""), EBool(true)), ILet(Id("""inDerivedConstructor"""), EBool(false))))), ISeq(List(ILet(Id("""inFunction"""), EBool(false)), ILet(Id("""inMethod"""), EBool(false)), ILet(Id("""inDerivedConstructor"""), EBool(false))))), ILet(Id("""__x5__"""), EParseSyntax(ERef(RefId(Id("""x"""))), EStr("""Script"""), List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EAbsent), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), ILet(Id("""script"""), ERef(RefId(Id("""__x5__""")))), IAccess(Id("""__x7__"""), ERef(RefId(Id("""script"""))), EStr("""Contains""")), IApp(Id("""__x8__"""), ERef(RefId(Id("""__x7__"""))), List(EStr("""ScriptBody"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IAccess(Id("""__x10__"""), ERef(RefId(Id("""script"""))), EStr("""ScriptBody""")), ILet(Id("""body"""), ERef(RefId(Id("""__x10__""")))), ILet(Id("""__x11__"""), EBOp(OEq, ERef(RefId(Id("""inFunction"""))), EBool(false))), IIf(ERef(RefId(Id("""__x11__"""))), ISeq(List(IAccess(Id("""__x12__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(EStr("""NewTarget"""))), IAssign(RefId(Id("""__x11__""")), ERef(RefId(Id("""__x13__""")))))), ISeq(List())), IIf(ERef(RefId(Id("""__x11__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())), ILet(Id("""__x15__"""), EBOp(OEq, ERef(RefId(Id("""inMethod"""))), EBool(false))), IIf(ERef(RefId(Id("""__x15__"""))), ISeq(List(IAccess(Id("""__x16__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")), IApp(Id("""__x17__"""), ERef(RefId(Id("""__x16__"""))), List(EStr("""SuperProperty"""))), IAssign(RefId(Id("""__x15__""")), ERef(RefId(Id("""__x17__""")))))), ISeq(List())), IIf(ERef(RefId(Id("""__x15__"""))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x18__""")))))), ISeq(List())), ILet(Id("""__x19__"""), EBOp(OEq, ERef(RefId(Id("""inDerivedConstructor"""))), EBool(false))), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IAccess(Id("""__x20__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")), IApp(Id("""__x21__"""), ERef(RefId(Id("""__x20__"""))), List(EStr("""SuperCall"""))), IAssign(RefId(Id("""__x19__""")), ERef(RefId(Id("""__x21__""")))))), ISeq(List())), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x22__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x22__""")))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""strictCaller"""))), EBool(true)), ILet(Id("""strictEval"""), EBool(true)), ISeq(List(IAccess(Id("""__x23__"""), ERef(RefId(Id("""script"""))), EStr("""IsStrict""")), ILet(Id("""strictEval"""), ERef(RefId(Id("""__x23__"""))))))), ILet(Id("""ctx"""), ERef(RefId(Id("""GLOBAL_context""")))), IIf(EBOp(OEq, ERef(RefId(Id("""direct"""))), EBool(true)), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefProp(RefId(Id("""ctx""")), EStr("""LexicalEnvironment"""))))), ILet(Id("""lexEnv"""), ERef(RefId(Id("""__x24__""")))), ILet(Id("""varEnv"""), ERef(RefProp(RefId(Id("""ctx""")), EStr("""VariableEnvironment""")))))), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefProp(RefId(Id("""evalRealm""")), EStr("""GlobalEnv"""))))), ILet(Id("""lexEnv"""), ERef(RefId(Id("""__x25__""")))), ILet(Id("""varEnv"""), ERef(RefProp(RefId(Id("""evalRealm""")), EStr("""GlobalEnv"""))))))), IIf(EBOp(OEq, ERef(RefId(Id("""strictEval"""))), EBool(true)), IAssign(RefId(Id("""varEnv""")), ERef(RefId(Id("""lexEnv""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""ctx"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull), IAssign(RefId(Id("""ctx""")), ENull))), ISeq(List())), ILet(Id("""evalCxt"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""Function""")), ENull), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""Realm""")), ERef(RefId(Id("""evalRealm""")))), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""ctx""")), EStr("""ScriptOrModule""")))), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""varEnv""")))), IAssign(RefProp(RefId(Id("""evalCxt""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lexEnv""")))), IAppend(ERef(RefId(Id("""evalCxt"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IApp(Id("""__x26__"""), ERef(RefId(Id("""EvalDeclarationInstantiation"""))), List(ERef(RefId(Id("""body"""))), ERef(RefId(Id("""varEnv"""))), ERef(RefId(Id("""lexEnv"""))), ERef(RefId(Id("""strictEval"""))))), ILet(Id("""result"""), ERef(RefId(Id("""__x26__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IAccess(Id("""__x27__"""), ERef(RefId(Id("""body"""))), EStr("""Evaluation""")), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x27__""")))))), ISeq(List())), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x28__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x28__""")))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ENull), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""evalCxt""")))), ISeq(List(IAssign(RefId(Id("""__x29__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x29__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IApp(Id("""__x30__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x30__"""))))), IReturn(ERef(RefId(Id("""__x31__""")))))))
  /* Beautified form:
  "PerformEval" (x, callerRealm, strictCaller, direct) => {
    app __x0__ = (Type x)
    if (! (= __x0__ String)) {
      app __x1__ = (WrapCompletion x)
      return __x1__
    } else {}
    let evalRealm = REALM
    app __x2__ = (HostEnsureCanCompileStrings callerRealm evalRealm)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (GetThisEnvironment )
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
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
  }
  */
}
