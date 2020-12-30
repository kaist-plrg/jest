package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTCreateDataPropertyOnObjectFunctions extends Algorithm {
  val name: String = "GLOBALDOTCreateDataPropertyOnObjectFunctions"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.CreateDataPropertyOnObjectFunctions" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (ToPropertyKey key)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let propertyKey = __x1__
    app __x2__ = (CreateDataPropertyOrThrow O propertyKey value)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion undefined)
    return __x3__
  }"""), this)
}
