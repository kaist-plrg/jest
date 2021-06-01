package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateDataPropertyOrThrow extends Algorithm {
  val name: String = "CreateDataPropertyOrThrow"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateDataPropertyOrThrow" (O, P, V) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (IsPropertyKey P)
    assert (= __x1__ true)
    app __x2__ = (CreateDataProperty O P V)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let success = __x2__
    if (= success false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion success)
    return __x4__
  }"""), this)
}
