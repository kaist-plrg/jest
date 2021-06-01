package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object EvalDeclarationInstantiation extends Algorithm {
  val name: String = "EvalDeclarationInstantiation"
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""EvalDeclarationInstantiation" (body, varEnv, lexEnv, strict) => {
    access __x0__ = (body "VarDeclaredNames")
    let varNames = __x0__
    access __x1__ = (body "VarScopedDeclarations")
    let varDeclarations = __x1__
    let lexEnvRec = lexEnv["EnvironmentRecord"]
    let varEnvRec = varEnv["EnvironmentRecord"]
    if (= strict false) {
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        let __x2__ = varNames
        let __x3__ = 0i
        while (< __x3__ __x2__["length"]) {
          let name = __x2__[__x3__]
          app __x4__ = (varEnvRec["HasLexicalDeclaration"] varEnvRec name)
          if (= __x4__ true) {
            app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x5__
          } else {}
          __x3__ = (+ __x3__ 1i)
        }
      } else {}
      let thisLex = lexEnv
      while (! (= thisLex varEnv)) {
        let thisEnvRec = thisLex["EnvironmentRecord"]
        if (! (= (typeof thisEnvRec) "ObjectEnvironmentRecord")) {
          let __x6__ = varNames
          let __x7__ = 0i
          while (< __x7__ __x6__["length"]) {
            let name = __x6__[__x7__]
            app __x8__ = (thisEnvRec["HasBinding"] thisEnvRec name)
            if (= __x8__ true) {
              app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x9__
            } else {}
            __x7__ = (+ __x7__ 1i)
          }
        } else {}
        thisLex = thisLex["Outer"]
      }
    } else {}
    let functionsToInitialize = (new [])
    let declaredFunctionNames = (new [])
    let __x10__ = varDeclarations
    let __x11__ = __x10__["length"]
    while (< 0i __x11__) {
      __x11__ = (- __x11__ 1i)
      let d = __x10__[__x11__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        assert (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration))
        access __x12__ = (d "BoundNames")
        let fn = __x12__[0i]
        if (! (contains declaredFunctionNames fn)) {
          if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
            app __x13__ = (varEnvRec["CanDeclareGlobalFunction"] varEnvRec fn)
            if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
            let fnDefinable = __x13__
            if (= fnDefinable false) {
              app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x14__
            } else {}
          } else {}
          append fn -> declaredFunctionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let declaredVarNames = (new [])
    let __x15__ = varDeclarations
    let __x16__ = 0i
    while (< __x16__ __x15__["length"]) {
      let d = __x15__[__x16__]
      if (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier)) {
        access __x17__ = (d "BoundNames")
        let __x18__ = __x17__
        let __x19__ = 0i
        while (< __x19__ __x18__["length"]) {
          let vn = __x18__[__x19__]
          if (! (contains declaredFunctionNames vn)) {
            if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
              app __x20__ = (varEnvRec["CanDeclareGlobalVar"] varEnvRec vn)
              if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
              let vnDefinable = __x20__
              if (= vnDefinable false) {
                app __x21__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
                return __x21__
              } else {}
            } else {}
            if (! (contains declaredVarNames vn)) append vn -> declaredVarNames else {}
          } else {}
          __x19__ = (+ __x19__ 1i)
        }
      } else {}
      __x16__ = (+ __x16__ 1i)
    }
    access __x22__ = (body "LexicallyScopedDeclarations")
    let lexDeclarations = __x22__
    let __x23__ = lexDeclarations
    let __x24__ = 0i
    while (< __x24__ __x23__["length"]) {
      let d = __x23__[__x24__]
      access __x25__ = (d "BoundNames")
      let __x26__ = __x25__
      let __x27__ = 0i
      while (< __x27__ __x26__["length"]) {
        let dn = __x26__[__x27__]
        access __x28__ = (d "IsConstantDeclaration")
        if (= __x28__ true) {
          app __x29__ = (lexEnvRec["CreateImmutableBinding"] lexEnvRec dn true)
          if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          __x29__
        } else {
          app __x30__ = (lexEnvRec["CreateMutableBinding"] lexEnvRec dn false)
          if (is-completion __x30__) if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          __x30__
        }
        __x27__ = (+ __x27__ 1i)
      }
      __x24__ = (+ __x24__ 1i)
    }
    let __x31__ = functionsToInitialize
    let __x32__ = 0i
    while (< __x32__ __x31__["length"]) {
      let f = __x31__[__x32__]
      access __x33__ = (f "BoundNames")
      let fn = __x33__[0i]
      access __x34__ = (f "InstantiateFunctionObject")
      app __x35__ = (__x34__ lexEnv)
      let fo = __x35__
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        app __x36__ = (varEnvRec["CreateGlobalFunctionBinding"] varEnvRec fn fo true)
        if (is-completion __x36__) if (= __x36__["Type"] CONST_normal) __x36__ = __x36__["Value"] else return __x36__ else {}
        __x36__
      } else {
        app __x37__ = (varEnvRec["HasBinding"] varEnvRec fn)
        let bindingExists = __x37__
        if (= bindingExists false) {
          app __x38__ = (varEnvRec["CreateMutableBinding"] varEnvRec fn true)
          if (is-completion __x38__) if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
          let status = __x38__
          app __x39__ = (varEnvRec["InitializeBinding"] varEnvRec fn fo)
          if (is-completion __x39__) if (= __x39__["Type"] CONST_normal) __x39__ = __x39__["Value"] else return __x39__ else {}
          __x39__
        } else {
          app __x40__ = (varEnvRec["SetMutableBinding"] varEnvRec fn fo false)
          if (is-completion __x40__) if (= __x40__["Type"] CONST_normal) __x40__ = __x40__["Value"] else return __x40__ else {}
          __x40__
        }
      }
      __x32__ = (+ __x32__ 1i)
    }
    let __x41__ = declaredVarNames
    let __x42__ = 0i
    while (< __x42__ __x41__["length"]) {
      let vn = __x41__[__x42__]
      if (= (typeof varEnvRec) "GlobalEnvironmentRecord") {
        app __x43__ = (varEnvRec["CreateGlobalVarBinding"] varEnvRec vn true)
        if (is-completion __x43__) if (= __x43__["Type"] CONST_normal) __x43__ = __x43__["Value"] else return __x43__ else {}
        __x43__
      } else {
        app __x44__ = (varEnvRec["HasBinding"] varEnvRec vn)
        let bindingExists = __x44__
        if (= bindingExists false) {
          app __x45__ = (varEnvRec["CreateMutableBinding"] varEnvRec vn true)
          if (is-completion __x45__) if (= __x45__["Type"] CONST_normal) __x45__ = __x45__["Value"] else return __x45__ else {}
          let status = __x45__
          app __x46__ = (varEnvRec["InitializeBinding"] varEnvRec vn undefined)
          if (is-completion __x46__) if (= __x46__["Type"] CONST_normal) __x46__ = __x46__["Value"] else return __x46__ else {}
          __x46__
        } else {}
      }
      __x42__ = (+ __x42__ 1i)
    }
    app __x47__ = (NormalCompletion CONST_empty)
    app __x48__ = (WrapCompletion __x47__)
    return __x48__
  }"""), this)
}
