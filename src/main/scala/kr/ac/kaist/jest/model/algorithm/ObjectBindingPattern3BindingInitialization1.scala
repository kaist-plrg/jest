package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectBindingPattern3BindingInitialization1 extends Algorithm {
  val name: String = "ObjectBindingPattern3BindingInitialization1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectBindingPattern3BindingInitialization1" (this, BindingPropertyList, BindingRestProperty, value, environment) => {
    access __x0__ = (BindingPropertyList "PropertyBindingInitialization")
    app __x1__ = (__x0__ value environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let excludedNames = __x1__
    access __x2__ = (BindingRestProperty "RestBindingInitialization")
    app __x3__ = (__x2__ value environment excludedNames)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
