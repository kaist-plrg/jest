package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTcopyWithin extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTcopyWithin"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.copyWithin" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let start = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let end = __x2__
    app __x3__ = (ToObject this)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    app __x4__ = (LengthOfArrayLike O)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    app __x5__ = (ToInteger target)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let relativeTarget = __x5__
    if (< relativeTarget 0i) {
      app __x6__ = (max (+ len relativeTarget) 0i)
      let to = __x6__
    } else {
      app __x7__ = (min relativeTarget len)
      let to = __x7__
    }
    app __x8__ = (ToInteger start)
    if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let relativeStart = __x8__
    if (< relativeStart 0i) {
      app __x9__ = (max (+ len relativeStart) 0i)
      let from = __x9__
    } else {
      app __x10__ = (min relativeStart len)
      let from = __x10__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x11__ = (ToInteger end)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let relativeEnd = __x11__
    }
    if (< relativeEnd 0i) {
      app __x12__ = (max (+ len relativeEnd) 0i)
      let final = __x12__
    } else {
      app __x13__ = (min relativeEnd len)
      let final = __x13__
    }
    app __x14__ = (min (- final from) (- len to))
    let count = __x14__
    if (&& (< from to) (< to (+ from count))) {
      let direction = (- 1i)
      from = (- (+ from count) 1i)
      to = (- (+ to count) 1i)
    } else let direction = 1i
    while (< 0i count) {
      app __x15__ = (ToString from)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      let fromKey = __x15__
      app __x16__ = (ToString to)
      if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
      let toKey = __x16__
      app __x17__ = (HasProperty O fromKey)
      if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
      let fromPresent = __x17__
      if (= fromPresent true) {
        app __x18__ = (Get O fromKey)
        if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        let fromVal = __x18__
        app __x19__ = (Set O toKey fromVal true)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
      } else {
        assert (= fromPresent false)
        app __x20__ = (DeletePropertyOrThrow O toKey)
        if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        __x20__
      }
      from = (+ from direction)
      to = (+ to direction)
      count = (- count 1i)
    }
    app __x21__ = (WrapCompletion O)
    return __x21__
  }"""), this)
}
