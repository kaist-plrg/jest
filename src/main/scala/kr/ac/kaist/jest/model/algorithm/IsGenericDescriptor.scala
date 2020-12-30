package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsGenericDescriptor extends Algorithm {
  val name: String = "IsGenericDescriptor"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsGenericDescriptor" (Desc) => {
    if (= Desc undefined) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    app __x1__ = (IsAccessorDescriptor Desc)
    app __x2__ = (IsDataDescriptor Desc)
    if (&& (= __x1__ false) (= __x2__ false)) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }"""), this)
}
