package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateIterResultObject extends Algorithm {
  val name: String = "CreateIterResultObject"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateIterResultObject" (value, done) => {
    app __x0__ = (Type done)
    assert (= __x0__ Boolean)
    app obj = (OrdinaryObjectCreate INTRINSIC_ObjectPrototype)
    app __x1__ = (CreateDataPropertyOrThrow obj "value" value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (CreateDataPropertyOrThrow obj "done" done)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion obj)
    return __x3__
  }"""), this)
}
