package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateDynamicFunction extends Algorithm {
  val name: String = "CreateDynamicFunction"
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""CreateDynamicFunction" (constructor, newTarget, kind, args) => {
    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    let calleeRealm = REALM
    app __x0__ = (HostEnsureCanCompileStrings callerRealm calleeRealm)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    if (= newTarget undefined) newTarget = constructor else {}
    if (= kind CONST_normal) {
      let goal = "FunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%Function.prototype%"
    } else if (= kind CONST_generator) {
      let goal = "GeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%Generator%"
    } else if (= kind CONST_async) {
      let goal = "AsyncFunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncFunction.prototype%"
    } else {
      assert (= kind CONST_asyncGenerator)
      let goal = "AsyncGeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncGenerator%"
    }
    let argCount = args["length"]
    let P = ""
    if (== argCount 0i) let bodyArg = "" else if (== argCount 1i) let bodyArg = args[0i] else {
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
        !!! "Set id:{P} to the string - concatenation of the previous value of id:{P} , value:{\",\"} ( a comma ) , and id:{nextArgString} ."
        k = (+ k 1i)
      }
      let bodyArg = args[k]
    }
    app __x3__ = (ToString bodyArg)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let bodyString = (+ (+ "\n" __x3__) "\n")
    !!! "Let id:{parameters} be the result of parsing ! UTF16DecodeString ( id:{P} ) , using id:{parameterGoal} as the goal symbol . Throw a value:{SyntaxError} exception if the parse fails ."
    !!! "Let id:{body} be the result of parsing ! UTF16DecodeString ( id:{bodyString} ) , using id:{goal} as the goal symbol . Throw a value:{SyntaxError} exception if the parse fails ."
    access __x4__ = (body "ContainsUseStrict")
    let strict = __x4__
    !!! "If any static semantics errors are detected for id:{parameters} or id:{body} , throw a value:{SyntaxError} exception . If id:{strict} is value:{true} , the Early Error rules for grammar:{UniqueFormalParameters0} are applied ."
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
    if (|| (= kind CONST_generator) (= kind CONST_asyncGenerator)) {
      access __x20__ = (parameters "Contains")
      app __x21__ = (__x20__ "YieldExpression")
      if (= __x21__ true) {
        app __x22__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x22__
      } else {}
    } else {}
    if (|| (= kind CONST_async) (= kind CONST_asyncGenerator)) {
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
    let realmF = REALM
    let scope = realmF["GlobalEnv"]
    app __x27__ = (OrdinaryFunctionCreate proto parameters body CONST_nonlexicalthis scope)
    if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
    let F = __x27__
    if (= kind CONST_generator) {
      !!! "Let id:{prototype} be OrdinaryObjectCreate ( % Generator . prototype % ) ."
      app __x28__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x28__
    } else if (= kind CONST_asyncGenerator) {
      !!! "Let id:{prototype} be OrdinaryObjectCreate ( % AsyncGenerator . prototype % ) ."
      app __x29__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x29__
    } else if (= kind CONST_normal) {
      app __x30__ = (MakeConstructor F)
      __x30__
    } else {}
    app __x31__ = (SetFunctionName F "anonymous")
    __x31__
    !!! "Let id:{prefix} be the prefix associated with id:{kind} in Table 48 ."
    let sourceString = (+ (+ (+ (+ (+ (+ prefix " anonymous(") P) "\n") ") {") bodyString) "}")
    app __x32__ = (UTF16DecodeString sourceString)
    if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
    F["SourceText"] = __x32__
    app __x33__ = (WrapCompletion F)
    return __x33__
  }"""), this)
}
