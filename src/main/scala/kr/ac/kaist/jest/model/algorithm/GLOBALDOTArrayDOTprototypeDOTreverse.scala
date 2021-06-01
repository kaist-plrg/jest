package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTreverse extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTreverse"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.reverse" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    app __x2__ = (floor (/ len 2i))
    let middle = __x2__
    let lower = 0i
    while (! (== lower middle)) {
      let upper = (- (- len lower) 1i)
      app __x3__ = (ToString upper)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let upperP = __x3__
      app __x4__ = (ToString lower)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let lowerP = __x4__
      app __x5__ = (HasProperty O lowerP)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let lowerExists = __x5__
      if (= lowerExists true) {
        app __x6__ = (Get O lowerP)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let lowerValue = __x6__
      } else {}
      app __x7__ = (HasProperty O upperP)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let upperExists = __x7__
      if (= upperExists true) {
        app __x8__ = (Get O upperP)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let upperValue = __x8__
      } else {}
      if (&& (= lowerExists true) (= upperExists true)) {
        app __x9__ = (Set O lowerP upperValue true)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
        app __x10__ = (Set O upperP lowerValue true)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x10__
      } else if (&& (= lowerExists false) (= upperExists true)) {
        app __x11__ = (Set O lowerP upperValue true)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        __x11__
        app __x12__ = (DeletePropertyOrThrow O upperP)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        __x12__
      } else if (&& (= lowerExists true) (= upperExists false)) {
        app __x13__ = (DeletePropertyOrThrow O lowerP)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        app __x14__ = (Set O upperP lowerValue true)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        __x14__
      } else assert (&& (= lowerExists false) (= upperExists false))
      lower = (+ lower 1i)
    }
    app __x15__ = (WrapCompletion O)
    return __x15__
  }"""), this)
}
