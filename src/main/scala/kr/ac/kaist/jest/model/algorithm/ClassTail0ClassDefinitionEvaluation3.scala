package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassTail0ClassDefinitionEvaluation3 extends Algorithm {
  val name: String = "ClassTail0ClassDefinitionEvaluation3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassTail0ClassDefinitionEvaluation3" (this, ClassHeritage, ClassBody, classBinding, className) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let lex = __x0__
    app __x1__ = (NewDeclarativeEnvironment lex)
    let classScope = __x1__
    let classScopeEnvRec = classScope["EnvironmentRecord"]
    if (! (= classBinding undefined)) {
      app __x2__ = (classScopeEnvRec["CreateImmutableBinding"] classScopeEnvRec classBinding true)
      __x2__
    } else {}
    if (= ClassHeritage absent) {
      let protoParent = INTRINSIC_ObjectPrototype
      let constructorParent = INTRINSIC_FunctionPrototype
    } else {
      GLOBAL_context["LexicalEnvironment"] = classScope
      access __x3__ = (ClassHeritage "Evaluation")
      let superclassRef = __x3__
      GLOBAL_context["LexicalEnvironment"] = lex
      app __x4__ = (GetValue superclassRef)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let superclass = __x4__
      if (= superclass null) {
        let protoParent = null
        let constructorParent = INTRINSIC_FunctionPrototype
      } else {
        app __x5__ = (IsConstructor superclass)
        if (= __x5__ false) {
          app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x6__
        } else {
          app __x7__ = (Get superclass "prototype")
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let protoParent = __x7__
          app __x8__ = (Type protoParent)
          if (! (|| (= __x8__ Object) (= __x8__ Null))) {
            app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x9__
          } else {}
          let constructorParent = superclass
        }
      }
    }
    app __x10__ = (OrdinaryObjectCreate protoParent)
    let proto = __x10__
    if (= ClassBody absent) let constructor = CONST_empty else {
      access __x11__ = (ClassBody "ConstructorMethod")
      let constructor = __x11__
    }
    if (= constructor CONST_empty) if (! (= ClassHeritage absent)) constructor = (parse-syntax "constructor(...args) { super(...args); }" "MethodDefinition" (new [false, false])) else constructor = (parse-syntax "constructor() {}" "MethodDefinition" (new [false, false])) else {}
    GLOBAL_context["LexicalEnvironment"] = classScope
    access __x12__ = (constructor "DefineMethod")
    app __x13__ = (__x12__ proto constructorParent)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let constructorInfo = __x13__
    if (is-completion constructorInfo) if (= constructorInfo["Type"] CONST_normal) constructorInfo = constructorInfo["Value"] else return constructorInfo else {}
    constructorInfo
    let F = constructorInfo["Closure"]
    app __x14__ = (MakeConstructor F false proto)
    __x14__
    if (! (= ClassHeritage absent)) F["ConstructorKind"] = CONST_derived else {}
    app __x15__ = (MakeClassConstructor F)
    __x15__
    if (! (= className undefined)) {
      app __x16__ = (SetFunctionName F className)
      __x16__
    } else {}
    app __x17__ = (CreateMethodProperty proto "constructor" F)
    __x17__
    if (= ClassBody absent) let methods = (new []) else {
      access __x18__ = (ClassBody "NonConstructorMethodDefinitions")
      let methods = __x18__
    }
    let __x19__ = methods
    let __x20__ = 0i
    while (< __x20__ __x19__["length"]) {
      let m = __x19__[__x20__]
      access __x21__ = (m "IsStatic")
      if (= __x21__ false) {
        access __x22__ = (m "PropertyDefinitionEvaluation")
        app __x23__ = (__x22__ proto false)
        let status = __x23__
      } else {
        access __x24__ = (m "PropertyDefinitionEvaluation")
        app __x25__ = (__x24__ F false)
        let status = __x25__
      }
      app __x26__ = (IsAbruptCompletion status)
      if __x26__ {
        GLOBAL_context["LexicalEnvironment"] = lex
        app __x27__ = (Completion status)
        app __x28__ = (WrapCompletion __x27__)
        return __x28__
      } else {}
      __x20__ = (+ __x20__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = lex
    if (! (= classBinding undefined)) {
      app __x29__ = (classScopeEnvRec["InitializeBinding"] classScopeEnvRec classBinding F)
      __x29__
    } else {}
    app __x30__ = (WrapCompletion F)
    return __x30__
  }"""), this)
}
