package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateDynamicFunction extends Algorithm {
  val name: String = "CreateDynamicFunction"
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""CreateDynamicFunction" (constructor, newTarget, kind, args) => {
    ??? "CreateDynamicFunction"

    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    let calleeRealm = REALM
    app __x0__ = (HostEnsureCanCompileStrings callerRealm calleeRealm)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    if (= newTarget undefined) newTarget = constructor else {}
    if (= kind CONST_normal) {
      let goal = (new Grammar ("Goal" -> "FunctionBody", "Arguments" -> (new [false, false])))
      let parameterGoal = (new Grammar ("Goal" -> "FormalParameters", "Arguments" -> (new [false, false])))
      let fallbackProto = "%Function.prototype%"
    } else if (= kind CONST_generator) {
      let goal = (new Grammar ("Goal" -> "GeneratorBody", "Arguments" -> (new [])))
      let parameterGoal = (new Grammar ("Goal" -> "FormalParameters", "Arguments" -> (new [true, false])))
      let fallbackProto = "%Generator%"
    } else if (= kind CONST_async) {
      let goal = (new Grammar ("Goal" -> "AsyncFunctionBody", "Arguments" -> (new [])))
      let parameterGoal = (new Grammar ("Goal" -> "FormalParameters", "Arguments" -> (new [false, true])))
      let fallbackProto = "%AsyncFunction.prototype%"
    } else {
      assert (= kind CONST_asyncGenerator)
      let goal = (new Grammar ("Goal" -> "AsyncGeneratorBody", "Arguments" -> (new [])))
      let parameterGoal = (new Grammar ("Goal" -> "FormalParameters", "Arguments" -> (new [true, true])))
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
        P = (+ (+ P ",") nextArgString)
        k = (+ k 1i)
      }
      let bodyArg = args[k]
    }
    app __x3__ = (ToString bodyArg)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let bodyString = (+ (+ "\n" __x3__) "\n")

    let parameters = (parse-syntax P parameterGoal.Goal parameterGoal.Arguments)
    if (= parameters absent) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}

    let body = (parse-syntax bodyString goal.Goal goal.Arguments)
    if (= body absent) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}

    access __x6__ = (parameters "IsSimpleParameterList")
    if (= __x6__ false) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}

    access boundNames = (parameters "BoundNames")
    let idx = 0i
    let len = boundNames.length
    access declNames = (body "LexicallyDeclaredNames")
    while (< idx len) {
      let name = boundNames[idx]
      if (contains declNames name) throw SyntaxError else {}
      idx = (+ idx 1i)
    }

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

    let tempList = (new [])
    idx = 0i
    while (< idx len) {
      name = boundNames[idx]
      if (contains tempList name) throw SyntaxError else {}
      append name -> tempList
      idx = (+ idx 1i)
    }

    app __x26__ = (GetPrototypeFromConstructor newTarget fallbackProto)
    if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let proto = __x26__
    let realmF = REALM
    let scope = realmF["GlobalEnv"]
    app __x27__ = (OrdinaryFunctionCreate proto parameters body CONST_nonlexicalthis scope)
    if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
    let F = __x27__
    if (= kind CONST_generator) {
      app prototype = (OrdinaryObjectCreate INTRINSIC_GeneratorPrototype)
      app __x28__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x28__
    } else if (= kind CONST_asyncGenerator) {
      app prototype = (OrdinaryObjectCreate INTRINSIC_AsyncGeneratorPrototype)
      app __x29__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x29__
    } else if (= kind CONST_normal) {
      app __x30__ = (MakeConstructor F)
      __x30__
    } else {}
    app __x31__ = (SetFunctionName F "anonymous")
    __x31__
    if (|| (= kind CONST_normal) (= kind CONST_generator)) let prefix = "function"
    else if (|| (= kind CONST_async) (= kind CONST_asyncGenerator)) let prefix = "async function"
    let sourceString = (+ (+ (+ (+ (+ (+ prefix " anonymous(") P) "\n") ") {") bodyString) "}")
    app __x32__ = sourceString
    if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
    F["SourceText"] = __x32__
    app __x33__ = (WrapCompletion F)
    return __x33__
  }"""), this)
}
