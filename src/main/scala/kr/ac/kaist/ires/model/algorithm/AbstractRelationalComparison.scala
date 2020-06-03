package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AbstractRelationalComparison {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AbstractRelationalComparison" (x, y, LeftFirst) => {
    if (= LeftFirst absent) let LeftFirst = true else {}
    if (= LeftFirst true) {
      app __x0__ = (ToPrimitive x Number)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let px = __x0__
      app __x1__ = (ToPrimitive y Number)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let py = __x1__
    } else {
      app __x2__ = (ToPrimitive y Number)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let py = __x2__
      app __x3__ = (ToPrimitive x Number)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let px = __x3__
    }
    app __x4__ = (Type px)
    let __x5__ = (= __x4__ String)
    if __x5__ {
      app __x6__ = (Type py)
      __x5__ = (= __x6__ String)
    } else {}
    if __x5__ return (< px py) else {
      app __x7__ = (ToNumber px)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let nx = __x7__
      app __x8__ = (ToNumber py)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let ny = __x8__
      if (= nx NaN) {
        app __x9__ = (WrapCompletion undefined)
        return __x9__
      } else {}
      if (= ny NaN) {
        app __x10__ = (WrapCompletion undefined)
        return __x10__
      } else {}
      if (= nx ny) {
        app __x11__ = (WrapCompletion false)
        return __x11__
      } else {}
      if (&& (= nx 0i) (= ny -0.0)) {
        app __x12__ = (WrapCompletion false)
        return __x12__
      } else {}
      if (&& (= nx -0.0) (= ny 0i)) {
        app __x13__ = (WrapCompletion false)
        return __x13__
      } else {}
      if (= nx Infinity) {
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
      if (= ny Infinity) {
        app __x15__ = (WrapCompletion true)
        return __x15__
      } else {}
      if (= ny -Infinity) {
        app __x16__ = (WrapCompletion false)
        return __x16__
      } else {}
      if (= nx -Infinity) {
        app __x17__ = (WrapCompletion true)
        return __x17__
      } else {}
      return (< nx ny)
    }
  }""")
}
