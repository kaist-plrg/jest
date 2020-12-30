package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElement1KeyedBindingInitialization1 extends Algorithm {
  val name: String = "BindingElement1KeyedBindingInitialization1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElement1KeyedBindingInitialization1" (this, BindingPattern, Initializer, value, environment, propertyName) => {
    app __x0__ = (GetV value propertyName)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let v = __x0__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      access __x1__ = (Initializer "Evaluation")
      let defaultValue = __x1__
      app __x2__ = (GetValue defaultValue)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      v = __x2__
    } else {}
    access __x3__ = (BindingPattern "BindingInitialization")
    app __x4__ = (__x3__ v environment)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
