package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BlockDeclarationInstantiation extends Algorithm {
  val name: String = "BlockDeclarationInstantiation"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BlockDeclarationInstantiation" (code, env) => {
    let envRec = env["EnvironmentRecord"]
    assert (= (typeof envRec) "DeclarativeEnvironmentRecord")
    access __x0__ = (code "LexicallyScopedDeclarations")
    let declarations = __x0__
    let __x1__ = declarations
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let d = __x1__[__x2__]
      access __x3__ = (d "BoundNames")
      let __x4__ = __x3__
      let __x5__ = 0i
      while (< __x5__ __x4__["length"]) {
        let dn = __x4__[__x5__]
        access __x6__ = (d "IsConstantDeclaration")
        if (= __x6__ true) {
          app __x7__ = (envRec["CreateImmutableBinding"] envRec dn true)
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          __x7__
        } else {
          app __x8__ = (envRec["CreateMutableBinding"] envRec dn false)
          if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          __x8__
        }
        __x5__ = (+ __x5__ 1i)
      }
      if (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration)) {
        access __x9__ = (d "BoundNames")
        let fn = __x9__[0i]
        access __x10__ = (d "InstantiateFunctionObject")
        app __x11__ = (__x10__ env)
        let fo = __x11__
        app __x12__ = (envRec["InitializeBinding"] envRec fn fo)
        __x12__
      } else {}
      __x2__ = (+ __x2__ 1i)
    }
  }"""), this)
}
