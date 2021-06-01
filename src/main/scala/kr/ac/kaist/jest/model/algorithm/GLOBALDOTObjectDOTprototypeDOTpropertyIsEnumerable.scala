package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTpropertyIsEnumerable extends Algorithm {
  val name: String = "GLOBALDOTObjectDOTprototypeDOTpropertyIsEnumerable"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Object.prototype.propertyIsEnumerable" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    app __x1__ = (ToPropertyKey V)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let P = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (O["GetOwnProperty"] O P)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let desc = __x3__
    if (= desc undefined) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion desc["Enumerable"])
    return __x5__
  }"""), this)
}
