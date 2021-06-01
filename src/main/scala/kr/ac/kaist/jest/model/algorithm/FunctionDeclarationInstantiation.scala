package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionDeclarationInstantiation extends Algorithm {
  val name: String = "FunctionDeclarationInstantiation"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclarationInstantiation" (func, argumentsList) => {
    let calleeContext = GLOBAL_context
    let code = func["ECMAScriptCode"]
    let strict = func["Strict"]
    let formals = func["FormalParameters"]
    access __x0__ = (formals "BoundNames")
    let parameterNames = __x0__
    app __x1__ = (IsDuplicate parameterNames)
    if __x1__ let hasDuplicates = true else let hasDuplicates = false
    access __x2__ = (formals "IsSimpleParameterList")
    let simpleParameterList = __x2__
    access __x3__ = (formals "ContainsExpression")
    let hasParameterExpressions = __x3__
    access __x4__ = (code "VarDeclaredNames")
    let varNames = __x4__
    access __x5__ = (code "VarScopedDeclarations")
    let varDeclarations = __x5__
    access __x6__ = (code "LexicallyDeclaredNames")
    let lexicalNames = __x6__
    let functionNames = (new [])
    let functionsToInitialize = (new [])
    let __x7__ = varDeclarations
    let __x8__ = __x7__["length"]
    while (< 0i __x8__) {
      __x8__ = (- __x8__ 1i)
      let d = __x7__[__x8__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        assert (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration))
        access __x9__ = (d "BoundNames")
        let fn = __x9__[0i]
        if (! (contains functionNames fn)) {
          prepend fn -> functionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let argumentsObjectNeeded = true
    if (= func["ThisMode"] CONST_lexical) argumentsObjectNeeded = false else if (contains parameterNames "arguments") argumentsObjectNeeded = false else if (= hasParameterExpressions false) if (|| (contains functionNames "arguments") (contains lexicalNames "arguments")) argumentsObjectNeeded = false else {} else {}
    if (|| (= strict true) (= hasParameterExpressions false)) {
      access __x10__ = (calleeContext "LexicalEnvironment")
      let env = __x10__
      let envRec = env["EnvironmentRecord"]
    } else {
      access __x11__ = (calleeContext "LexicalEnvironment")
      let calleeEnv = __x11__
      app __x12__ = (NewDeclarativeEnvironment calleeEnv)
      let env = __x12__
      let envRec = env["EnvironmentRecord"]
      access __x13__ = (calleeContext "VariableEnvironment")
      assert (= __x13__ calleeEnv)
      calleeContext["LexicalEnvironment"] = env
    }
    let __x14__ = parameterNames
    let __x15__ = 0i
    while (< __x15__ __x14__["length"]) {
      let paramName = __x14__[__x15__]
      app __x16__ = (envRec["HasBinding"] envRec paramName)
      let alreadyDeclared = __x16__
      if (= alreadyDeclared false) {
        app __x17__ = (envRec["CreateMutableBinding"] envRec paramName false)
        if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
        __x17__
        if (= hasDuplicates true) {
          app __x18__ = (envRec["InitializeBinding"] envRec paramName undefined)
          if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
          __x18__
        } else {}
      } else {}
      __x15__ = (+ __x15__ 1i)
    }
    if (= argumentsObjectNeeded true) {
      if (|| (= strict true) (= simpleParameterList false)) {
        app __x19__ = (CreateUnmappedArgumentsObject argumentsList)
        let ao = __x19__
      } else {
        app __x20__ = (CreateMappedArgumentsObject func formals argumentsList envRec)
        let ao = __x20__
      }
      if (= strict true) {
        app __x21__ = (envRec["CreateImmutableBinding"] envRec "arguments" false)
        if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
        __x21__
      } else {
        app __x22__ = (envRec["CreateMutableBinding"] envRec "arguments" false)
        if (is-completion __x22__) if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
        __x22__
      }
      app __x23__ = (envRec["InitializeBinding"] envRec "arguments" ao)
      __x23__
      let __x24__ = (copy-obj parameterNames)
      append "arguments" -> __x24__
      let parameterBindings = __x24__
    } else let parameterBindings = parameterNames
    app __x25__ = (CreateListIteratorRecord argumentsList)
    let iteratorRecord = __x25__
    if (= hasDuplicates true) {
      access __x26__ = (formals "IteratorBindingInitialization")
      app __x27__ = (__x26__ iteratorRecord undefined)
      if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
      __x27__
    } else {
      access __x28__ = (formals "IteratorBindingInitialization")
      app __x29__ = (__x28__ iteratorRecord env)
      if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      __x29__
    }
    if (= hasParameterExpressions false) {
      let instantiatedVarNames = (copy-obj parameterBindings)
      let __x30__ = varNames
      let __x31__ = 0i
      while (< __x31__ __x30__["length"]) {
        let n = __x30__[__x31__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x32__ = (envRec["CreateMutableBinding"] envRec n false)
          if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
          __x32__
          app __x33__ = (envRec["InitializeBinding"] envRec n undefined)
          __x33__
        } else {}
        __x31__ = (+ __x31__ 1i)
      }
      let varEnv = env
      let varEnvRec = envRec
    } else {
      app __x34__ = (NewDeclarativeEnvironment env)
      let varEnv = __x34__
      let varEnvRec = varEnv["EnvironmentRecord"]
      calleeContext["VariableEnvironment"] = varEnv
      let instantiatedVarNames = (new [])
      let __x35__ = varNames
      let __x36__ = 0i
      while (< __x36__ __x35__["length"]) {
        let n = __x35__[__x36__]
        if (! (contains instantiatedVarNames n)) {
          append n -> instantiatedVarNames
          app __x37__ = (varEnvRec["CreateMutableBinding"] varEnvRec n false)
          if (is-completion __x37__) if (= __x37__["Type"] CONST_normal) __x37__ = __x37__["Value"] else return __x37__ else {}
          __x37__
          if (|| (! (contains parameterBindings n)) (contains functionNames n)) let initialValue = undefined else {
            app __x38__ = (envRec["GetBindingValue"] envRec n false)
            if (is-completion __x38__) if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
            let initialValue = __x38__
          }
          app __x39__ = (varEnvRec["InitializeBinding"] varEnvRec n initialValue)
          __x39__
        } else {}
        __x36__ = (+ __x36__ 1i)
      }
    }
    if (= strict false) {
      app __x40__ = (NewDeclarativeEnvironment varEnv)
      let lexEnv = __x40__
    } else let lexEnv = varEnv
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    calleeContext["LexicalEnvironment"] = lexEnv
    access __x41__ = (code "LexicallyScopedDeclarations")
    let lexDeclarations = __x41__
    let __x42__ = lexDeclarations
    let __x43__ = 0i
    while (< __x43__ __x42__["length"]) {
      let d = __x42__[__x43__]
      access __x44__ = (d "BoundNames")
      let __x45__ = __x44__
      let __x46__ = 0i
      while (< __x46__ __x45__["length"]) {
        let dn = __x45__[__x46__]
        access __x47__ = (d "IsConstantDeclaration")
        if (= __x47__ true) {
          app __x48__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (is-completion __x48__) if (= __x48__["Type"] CONST_normal) __x48__ = __x48__["Value"] else return __x48__ else {}
          __x48__
        } else {
          app __x49__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (is-completion __x49__) if (= __x49__["Type"] CONST_normal) __x49__ = __x49__["Value"] else return __x49__ else {}
          __x49__
        }
        __x46__ = (+ __x46__ 1i)
      }
      __x43__ = (+ __x43__ 1i)
    }
    let __x50__ = functionsToInitialize
    let __x51__ = 0i
    while (< __x51__ __x50__["length"]) {
      let f = __x50__[__x51__]
      access __x52__ = (f "BoundNames")
      let fn = __x52__[0i]
      access __x53__ = (f "InstantiateFunctionObject")
      app __x54__ = (__x53__ lexEnv)
      let fo = __x54__
      app __x55__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
      if (is-completion __x55__) if (= __x55__["Type"] CONST_normal) __x55__ = __x55__["Value"] else return __x55__ else {}
      __x55__
      __x51__ = (+ __x51__ 1i)
    }
    app __x56__ = (NormalCompletion CONST_empty)
    app __x57__ = (WrapCompletion __x56__)
    return __x57__
  }"""), this)
}
