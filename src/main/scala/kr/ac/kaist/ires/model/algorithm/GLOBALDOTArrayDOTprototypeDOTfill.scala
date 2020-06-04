package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTfill extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.fill" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
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
    app __x6__ = (ToInteger start)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let relativeStart = __x6__
    if (< relativeStart 0i) {
      app __x7__ = (max (+ len relativeStart) 0i)
      let k = __x7__
    } else {
      app __x8__ = (min relativeStart len)
      let k = __x8__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x9__ = (ToInteger end)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let relativeEnd = __x9__
    }
    if (< relativeEnd 0i) {
      app __x10__ = (max (+ len relativeEnd) 0i)
      let final = __x10__
    } else {
      app __x11__ = (min relativeEnd len)
      let final = __x11__
    }
    while (< k final) {
      app __x12__ = (ToString k)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let Pk = __x12__
      app __x13__ = (Set O Pk value true)
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      __x13__
      k = (+ k 1i)
    }
    app __x14__ = (WrapCompletion O)
    return __x14__
  }""")
}
