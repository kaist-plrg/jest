package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTgetOwnPropertyDescriptor extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTgetOwnPropertyDescriptor"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.getOwnPropertyDescriptor" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let P = __x1__
    app __x2__ = (ToObject O)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let obj = __x2__
    app __x3__ = (ToPropertyKey P)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let key = __x3__
    app __x4__ = (obj["GetOwnProperty"] obj key)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let desc = __x4__
    app __x5__ = (FromPropertyDescriptor desc)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }"""), this)
}
