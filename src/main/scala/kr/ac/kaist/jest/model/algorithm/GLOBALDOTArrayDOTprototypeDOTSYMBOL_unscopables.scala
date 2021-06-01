package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTSYMBOL_unscopables extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTSYMBOL_unscopables"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.SYMBOL_unscopables" (this, argumentsList, NewTarget) => {
    app __x0__ = (OrdinaryObjectCreate null)
    let unscopableList = __x0__
    app __x1__ = (CreateDataPropertyOrThrow unscopableList "copyWithin" true)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (CreateDataPropertyOrThrow unscopableList "entries" true)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (CreateDataPropertyOrThrow unscopableList "fill" true)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (CreateDataPropertyOrThrow unscopableList "find" true)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    app __x5__ = (CreateDataPropertyOrThrow unscopableList "findIndex" true)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (CreateDataPropertyOrThrow unscopableList "flat" true)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (CreateDataPropertyOrThrow unscopableList "flatMap" true)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    app __x8__ = (CreateDataPropertyOrThrow unscopableList "includes" true)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    __x8__
    app __x9__ = (CreateDataPropertyOrThrow unscopableList "keys" true)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (CreateDataPropertyOrThrow unscopableList "values" true)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion unscopableList)
    return __x11__
  }"""), this)
}
