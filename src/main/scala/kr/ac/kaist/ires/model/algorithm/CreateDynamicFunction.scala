package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateDynamicFunction {
  val length: Int = 4
  val func: Func = Func("""CreateDynamicFunction""", List(Id("""constructor"""), Id("""newTarget"""), Id("""kind"""), Id("""args""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(2L))))), ILet(Id("""callerRealm"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""Realm""")))), ILet(Id("""calleeRealm"""), ERef(RefId(Id("""REALM""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""HostEnsureCanCompileStrings"""))), List(ERef(RefId(Id("""callerRealm"""))), ERef(RefId(Id("""calleeRealm"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""newTarget"""))), EUndef), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""constructor""")))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""normal""")), ISeq(List(ILet(Id("""goal"""), EStr("""FunctionBody""")), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")), ILet(Id("""fallbackProto"""), EStr("""%FunctionPrototype%""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""generator""")), ISeq(List(ILet(Id("""goal"""), EStr("""GeneratorBody""")), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")), ILet(Id("""fallbackProto"""), EStr("""%Generator%""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async""")), ISeq(List(ILet(Id("""goal"""), EStr("""AsyncFunctionBody""")), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")), ILet(Id("""fallbackProto"""), EStr("""%AsyncFunctionPrototype%""")))), ISeq(List(IAssert(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator"""))), ILet(Id("""goal"""), EStr("""AsyncGeneratorBody""")), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")), ILet(Id("""fallbackProto"""), EStr("""%AsyncGenerator%"""))))))), ILet(Id("""argCount"""), ERef(RefProp(RefId(Id("""args""")), EStr("""length""")))), ILet(Id("""P"""), EStr("""""")), IIf(EBOp(OEq, ERef(RefId(Id("""argCount"""))), EINum(0L)), ILet(Id("""bodyText"""), EStr("""""")), IIf(EBOp(OEq, ERef(RefId(Id("""argCount"""))), EINum(1L)), ILet(Id("""bodyText"""), ERef(RefProp(RefId(Id("""args""")), EINum(0L)))), ISeq(List(IAssert(EBOp(OLt, EINum(1L), ERef(RefId(Id("""argCount"""))))), ILet(Id("""firstArg"""), ERef(RefProp(RefId(Id("""args""")), EINum(0L)))), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""firstArg"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IAssign(RefId(Id("""P""")), ERef(RefId(Id("""__x1__""")))), ILet(Id("""k"""), EINum(1L)), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), EBOp(OSub, ERef(RefId(Id("""argCount"""))), EINum(1L))), ISeq(List(ILet(Id("""nextArg"""), ERef(RefProp(RefId(Id("""args""")), ERef(RefId(Id("""k""")))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""nextArg"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""nextArgString"""), ERef(RefId(Id("""__x2__""")))), IAssign(RefId(Id("""P""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""P"""))), EStr(""",""")), ERef(RefId(Id("""nextArgString"""))))), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L)))))), ILet(Id("""bodyText"""), ERef(RefProp(RefId(Id("""args""")), ERef(RefId(Id("""k""")))))))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""bodyText"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IAssign(RefId(Id("""bodyText""")), ERef(RefId(Id("""__x3__""")))), IExpr(ENotSupported("""Etc""")), IExpr(ENotSupported("""Etc""")), IAccess(Id("""__x4__"""), ERef(RefId(Id("""body"""))), EStr("""ContainsUseStrict""")), ILet(Id("""strict"""), ERef(RefId(Id("""__x4__""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""__x5__"""), EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true))), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""parameters"""))), EStr("""IsSimpleParameterList""")), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false))))), ISeq(List())), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x7__""")))))), ISeq(List())), IExpr(ENotSupported("""Etc""")), IAccess(Id("""__x8__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(EStr("""SuperCall"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IAccess(Id("""__x11__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")), IApp(Id("""__x12__"""), ERef(RefId(Id("""__x11__"""))), List(EStr("""SuperCall"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(true)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x13__""")))))), ISeq(List())), IAccess(Id("""__x14__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")), IApp(Id("""__x15__"""), ERef(RefId(Id("""__x14__"""))), List(EStr("""SuperProperty"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x15__"""))), EBool(true)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x16__""")))))), ISeq(List())), IAccess(Id("""__x17__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")), IApp(Id("""__x18__"""), ERef(RefId(Id("""__x17__"""))), List(EStr("""SuperProperty"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x18__"""))), EBool(true)), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x19__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""generator""")), EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator"""))), ISeq(List(IAccess(Id("""__x20__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")), IApp(Id("""__x21__"""), ERef(RefId(Id("""__x20__"""))), List(EStr("""YieldExpression"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x21__"""))), EBool(true)), ISeq(List(IApp(Id("""__x22__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x22__""")))))), ISeq(List())))), ISeq(List())), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async""")), EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator"""))), ISeq(List(IAccess(Id("""__x23__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")), IApp(Id("""__x24__"""), ERef(RefId(Id("""__x23__"""))), List(EStr("""AwaitExpression"""))), IIf(EBOp(OEq, ERef(RefId(Id("""__x24__"""))), EBool(true)), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))), IReturn(ERef(RefId(Id("""__x25__""")))))), ISeq(List())))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true)), IExpr(ENotSupported("""Etc""")), ISeq(List())), IApp(Id("""__x26__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), ERef(RefId(Id("""fallbackProto"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x26__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x26__"""))))), ISeq(List())), ILet(Id("""proto"""), ERef(RefId(Id("""__x26__""")))), IApp(Id("""__x27__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""proto"""))), ERef(RefId(Id("""kind"""))))), ILet(Id("""F"""), ERef(RefId(Id("""__x27__""")))), ILet(Id("""realmF"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""realmF""")), EStr("""GlobalEnv""")))), IApp(Id("""__x28__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""body"""))), ERef(RefId(Id("""scope"""))))), IExpr(ERef(RefId(Id("""__x28__""")))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""generator""")), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))), ILet(Id("""prototype"""), ERef(RefId(Id("""__x29__""")))), IApp(Id("""__x30__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IExpr(ERef(RefId(Id("""__x30__""")))))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator""")), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncGeneratorPrototype"""))))), ILet(Id("""prototype"""), ERef(RefId(Id("""__x31__""")))), IApp(Id("""__x32__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))), IExpr(ERef(RefId(Id("""__x32__""")))))), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""normal""")), ISeq(List(IApp(Id("""__x33__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))))), IExpr(ERef(RefId(Id("""__x33__""")))))), ISeq(List())))), IApp(Id("""__x34__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""anonymous"""))), IExpr(ERef(RefId(Id("""__x34__""")))), IExpr(ENotSupported("""Etc""")), ILet(Id("""sourceText"""), EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""prefix"""))), EStr(""" anonymous(""")), ERef(RefId(Id("""P""")))), EStr("""
""")), EStr(""") {""")), EStr("""
""")), ERef(RefId(Id("""bodyText""")))), EStr("""
""")), EStr("""}"""))), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), ERef(RefId(Id("""sourceText""")))), IApp(Id("""__x35__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))), IReturn(ERef(RefId(Id("""__x35__""")))))))
  /* Beautified form:
  "CreateDynamicFunction" (constructor, newTarget, kind, args) => {
    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    let calleeRealm = REALM
    app __x0__ = (HostEnsureCanCompileStrings callerRealm calleeRealm)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    if (= newTarget undefined) newTarget = constructor else {}
    if (= kind "normal") {
      let goal = "FunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%FunctionPrototype%"
    } else if (= kind "generator") {
      let goal = "GeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%Generator%"
    } else if (= kind "async") {
      let goal = "AsyncFunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncFunctionPrototype%"
    } else {
      assert (= kind "async generator")
      let goal = "AsyncGeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncGenerator%"
    }
    let argCount = args["length"]
    let P = ""
    if (= argCount 0i) let bodyText = "" else if (= argCount 1i) let bodyText = args[0i] else {
      assert (< 1i argCount)
      let firstArg = args[0i]
      app __x1__ = (ToString firstArg)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      P = __x1__
      let k = 1i
      while (< k (- argCount 1i)) {
        let nextArg = args[k]
        app __x2__ = (ToString nextArg)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let nextArgString = __x2__
        P = (+ (+ P ",") nextArgString)
        k = (+ k 1i)
      }
      let bodyText = args[k]
    }
    app __x3__ = (ToString bodyText)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    bodyText = __x3__
    !!! "Etc"
    !!! "Etc"
    access __x4__ = (body "ContainsUseStrict")
    let strict = __x4__
    !!! "Etc"
    let __x5__ = (= strict true)
    if __x5__ {
      access __x6__ = (parameters "IsSimpleParameterList")
      __x5__ = (= __x6__ false)
    } else {}
    if __x5__ {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    !!! "Etc"
    access __x8__ = (body "Contains")
    app __x9__ = (__x8__ "SuperCall")
    if (= __x9__ true) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    access __x11__ = (parameters "Contains")
    app __x12__ = (__x11__ "SuperCall")
    if (= __x12__ true) {
      app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x13__
    } else {}
    access __x14__ = (body "Contains")
    app __x15__ = (__x14__ "SuperProperty")
    if (= __x15__ true) {
      app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x16__
    } else {}
    access __x17__ = (parameters "Contains")
    app __x18__ = (__x17__ "SuperProperty")
    if (= __x18__ true) {
      app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x19__
    } else {}
    if (|| (= kind "generator") (= kind "async generator")) {
      access __x20__ = (parameters "Contains")
      app __x21__ = (__x20__ "YieldExpression")
      if (= __x21__ true) {
        app __x22__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x22__
      } else {}
    } else {}
    if (|| (= kind "async") (= kind "async generator")) {
      access __x23__ = (parameters "Contains")
      app __x24__ = (__x23__ "AwaitExpression")
      if (= __x24__ true) {
        app __x25__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x25__
      } else {}
    } else {}
    if (= strict true) !!! "Etc" else {}
    app __x26__ = (GetPrototypeFromConstructor newTarget fallbackProto)
    if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let proto = __x26__
    app __x27__ = (FunctionAllocate proto kind)
    let F = __x27__
    let realmF = F["Realm"]
    let scope = realmF["GlobalEnv"]
    app __x28__ = (FunctionInitialize F CONST_Normal parameters body scope)
    __x28__
    if (= kind "generator") {
      app __x29__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
      let prototype = __x29__
      app __x30__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x30__
    } else if (= kind "async generator") {
      app __x31__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
      let prototype = __x31__
      app __x32__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x32__
    } else if (= kind "normal") {
      app __x33__ = (MakeConstructor F)
      __x33__
    } else {}
    app __x34__ = (SetFunctionName F "anonymous")
    __x34__
    !!! "Etc"
    let sourceText = (+ (+ (+ (+ (+ (+ (+ (+ prefix " anonymous(") P) "\n") ") {") "\n") bodyText) "\n") "}")
    F["SourceText"] = sourceText
    app __x35__ = (WrapCompletion F)
    return __x35__
  }
  */
}
