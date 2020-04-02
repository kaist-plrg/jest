package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTcopyWithin {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.copyWithin" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let start = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let end = __x2__
    app __x3__ = (ToObject this)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    app __x4__ = (Get O "length")
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToLength __x4__)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let len = __x5__
    app __x6__ = (ToInteger target)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let relativeTarget = __x6__
    if (< relativeTarget 0i) {
      app __x7__ = (max (+ len relativeTarget) 0i)
      let to = __x7__
    } else {
      app __x8__ = (min relativeTarget len)
      let to = __x8__
    }
    app __x9__ = (ToInteger start)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let relativeStart = __x9__
    if (< relativeStart 0i) {
      app __x10__ = (max (+ len relativeStart) 0i)
      let from = __x10__
    } else {
      app __x11__ = (min relativeStart len)
      let from = __x11__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x12__ = (ToInteger end)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let relativeEnd = __x12__
    }
    if (< relativeEnd 0i) {
      app __x13__ = (max (+ len relativeEnd) 0i)
      let final = __x13__
    } else {
      app __x14__ = (min relativeEnd len)
      let final = __x14__
    }
    app __x15__ = (min (- final from) (- len to))
    let count = __x15__
    if (&& (< from to) (< to (+ from count))) {
      let direction = (- 1i)
      from = (- (+ from count) 1i)
      to = (- (+ to count) 1i)
    } else let direction = 1i
    while (< 0i count) {
      app __x16__ = (ToString from)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      let fromKey = __x16__
      app __x17__ = (ToString to)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      let toKey = __x17__
      app __x18__ = (HasProperty O fromKey)
      if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
      let fromPresent = __x18__
      if (= fromPresent true) {
        app __x19__ = (Get O fromKey)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        let fromVal = __x19__
        app __x20__ = (Set O toKey fromVal true)
        if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        __x20__
      } else {
        app __x21__ = (DeletePropertyOrThrow O toKey)
        if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
        __x21__
      }
      from = (+ from direction)
      to = (+ to direction)
      count = (- count 1i)
    }
    app __x22__ = (WrapCompletion O)
    return __x22__
  }""")
}
