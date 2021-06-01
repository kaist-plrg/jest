package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForDeclaration0BindingInstantiation0 extends Algorithm {
  val name: String = "ForDeclaration0BindingInstantiation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForDeclaration0BindingInstantiation0" (this, LetOrConst, ForBinding, environment) => {
    let envRec = environment["EnvironmentRecord"]
    assert (= (typeof envRec) "DeclarativeEnvironmentRecord")
    access __x0__ = (ForBinding "BoundNames")
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let name = __x1__[__x2__]
      access __x3__ = (LetOrConst "IsConstantDeclaration")
      if (= __x3__ true) {
        app __x4__ = (envRec["CreateImmutableBinding"] envRec name true)
        if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      } else {
        app __x5__ = (envRec["CreateMutableBinding"] envRec name false)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      }
      __x2__ = (+ __x2__ 1i)
    }
  }"""), this)
}
