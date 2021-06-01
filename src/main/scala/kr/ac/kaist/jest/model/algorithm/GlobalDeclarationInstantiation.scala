package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GlobalDeclarationInstantiation extends Algorithm {
  val name: String = "GlobalDeclarationInstantiation"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalDeclarationInstantiation" (script, env) => {
    let envRec = env["EnvironmentRecord"]
    assert (= (typeof envRec) "GlobalEnvironmentRecord")
    access __x0__ = (script "LexicallyDeclaredNames")
    let lexNames = __x0__
    access __x1__ = (script "VarDeclaredNames")
    let varNames = __x1__
    let __x2__ = lexNames
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let name = __x2__[__x3__]
      app __x4__ = (envRec["HasVarDeclaration"] envRec name)
      if (= __x4__ true) {
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      app __x6__ = (envRec["HasLexicalDeclaration"] envRec name)
      if (= __x6__ true) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x7__
      } else {}
      app __x8__ = (envRec["HasRestrictedGlobalProperty"] envRec name)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let hasRestrictedGlobal = __x8__
      if (= hasRestrictedGlobal true) {
        app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x9__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    let __x10__ = varNames
    let __x11__ = 0i
    while (< __x11__ __x10__["length"]) {
      let name = __x10__[__x11__]
      app __x12__ = (envRec["HasLexicalDeclaration"] envRec name)
      if (= __x12__ true) {
        app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x13__
      } else {}
      __x11__ = (+ __x11__ 1i)
    }
    access __x14__ = (script "VarScopedDeclarations")
    let varDeclarations = __x14__
    let functionsToInitialize = (new [])
    let declaredFunctionNames = (new [])
    let __x15__ = varDeclarations
    let __x16__ = __x15__["length"]
    while (< 0i __x16__) {
      __x16__ = (- __x16__ 1i)
      let d = __x15__[__x16__]
      if (! (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier))) {
        assert (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration))
        access __x17__ = (d "BoundNames")
        let fn = __x17__[0i]
        if (! (contains declaredFunctionNames fn)) {
          app __x18__ = (envRec["CanDeclareGlobalFunction"] envRec fn)
          if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
          let fnDefinable = __x18__
          if (= fnDefinable false) {
            app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x19__
          } else {}
          append fn -> declaredFunctionNames
          prepend d -> functionsToInitialize
        } else {}
      } else {}
    }
    let declaredVarNames = (new [])
    let __x20__ = varDeclarations
    let __x21__ = 0i
    while (< __x21__ __x20__["length"]) {
      let d = __x20__[__x21__]
      if (|| (|| (is-instance-of d VariableDeclaration) (is-instance-of d ForBinding)) (is-instance-of d BindingIdentifier)) {
        access __x22__ = (d "BoundNames")
        let __x23__ = __x22__
        let __x24__ = 0i
        while (< __x24__ __x23__["length"]) {
          let vn = __x23__[__x24__]
          if (! (contains declaredFunctionNames vn)) {
            app __x25__ = (envRec["CanDeclareGlobalVar"] envRec vn)
            if (is-completion __x25__) if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
            let vnDefinable = __x25__
            if (= vnDefinable false) {
              app __x26__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
              return __x26__
            } else {}
            if (! (contains declaredVarNames vn)) append vn -> declaredVarNames else {}
          } else {}
          __x24__ = (+ __x24__ 1i)
        }
      } else {}
      __x21__ = (+ __x21__ 1i)
    }
    access __x27__ = (script "LexicallyScopedDeclarations")
    let lexDeclarations = __x27__
    let __x28__ = lexDeclarations
    let __x29__ = 0i
    while (< __x29__ __x28__["length"]) {
      let d = __x28__[__x29__]
      access __x30__ = (d "BoundNames")
      let __x31__ = __x30__
      let __x32__ = 0i
      while (< __x32__ __x31__["length"]) {
        let dn = __x31__[__x32__]
        access __x33__ = (d "IsConstantDeclaration")
        if (= __x33__ true) {
          app __x34__ = (envRec["CreateImmutableBinding"] envRec dn true)
          if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
          __x34__
        } else {
          app __x35__ = (envRec["CreateMutableBinding"] envRec dn false)
          if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
          __x35__
        }
        __x32__ = (+ __x32__ 1i)
      }
      __x29__ = (+ __x29__ 1i)
    }
    let __x36__ = functionsToInitialize
    let __x37__ = 0i
    while (< __x37__ __x36__["length"]) {
      let f = __x36__[__x37__]
      access __x38__ = (f "BoundNames")
      let fn = __x38__[0i]
      access __x39__ = (f "InstantiateFunctionObject")
      app __x40__ = (__x39__ env)
      let fo = __x40__
      app __x41__ = (envRec["CreateGlobalFunctionBinding"] envRec fn fo false)
      if (is-completion __x41__) if (= __x41__["Type"] CONST_normal) __x41__ = __x41__["Value"] else return __x41__ else {}
      __x41__
      __x37__ = (+ __x37__ 1i)
    }
    let __x42__ = declaredVarNames
    let __x43__ = 0i
    while (< __x43__ __x42__["length"]) {
      let vn = __x42__[__x43__]
      app __x44__ = (envRec["CreateGlobalVarBinding"] envRec vn false)
      if (is-completion __x44__) if (= __x44__["Type"] CONST_normal) __x44__ = __x44__["Value"] else return __x44__ else {}
      __x44__
      __x43__ = (+ __x43__ 1i)
    }
    app __x45__ = (NormalCompletion CONST_empty)
    app __x46__ = (WrapCompletion __x45__)
    return __x46__
  }"""), this)
}
