package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingRestProperty0RestBindingInitialization0 extends Algorithm {
  val name: String = "BindingRestProperty0RestBindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingRestProperty0RestBindingInitialization0" (this, BindingIdentifier, value, environment, excludedNames) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__ environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app restObj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    app __x2__ = (CopyDataProperties restObj value excludedNames)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    if (= environment undefined) {
      app __x3__ = (PutValue lhs restObj)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (InitializeReferencedBinding lhs restObj)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
