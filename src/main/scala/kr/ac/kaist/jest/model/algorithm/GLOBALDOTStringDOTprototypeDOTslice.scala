package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTslice extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTslice"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.slice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let len = S["length"]
    app __x4__ = (ToInteger start)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let intStart = __x4__
    if (= end undefined) let intEnd = len else {
      app __x5__ = (ToInteger end)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let intEnd = __x5__
    }
    if (< intStart 0i) {
      app __x6__ = (max (+ len intStart) 0i)
      let from = __x6__
    } else {
      app __x7__ = (min intStart len)
      let from = __x7__
    }
    if (< intEnd 0i) {
      app __x8__ = (max (+ len intEnd) 0i)
      let to = __x8__
    } else {
      app __x9__ = (min intEnd len)
      let to = __x9__
    }
    app __x10__ = (max (- to from) 0i)
    let span = __x10__
    let result = ""
    let idx = 0i
    while (< idx span) {
      result = (+ result S[(+ from idx)])
      idx = (+ idx 1i)
    }
    return result
  }"""), this)
}
