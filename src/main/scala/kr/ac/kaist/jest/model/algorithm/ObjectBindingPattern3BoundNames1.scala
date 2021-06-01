package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectBindingPattern3BoundNames1 extends Algorithm {
  val name: String = "ObjectBindingPattern3BoundNames1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectBindingPattern3BoundNames1" (this, BindingPropertyList, BindingRestProperty) => {
    access __x0__ = (BindingPropertyList "BoundNames")
    let names = __x0__
    access __x1__ = (BindingRestProperty "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }"""), this)
}
