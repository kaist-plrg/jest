package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTdecodeURIComponent extends Algorithm {
  val name: String = "GLOBALDOTdecodeURIComponent"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.decodeURIComponent" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.decodeURIComponent"

    app __x0__ = (GetArgument argumentsList 0i)
    let encodedURIComponent = __x0__
    app __x1__ = (ToString encodedURIComponent)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let componentString = __x1__
    let reservedURIComponentSet = ""
    app __x2__ = (Decode componentString reservedURIComponentSet)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
