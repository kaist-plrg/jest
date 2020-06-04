package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTslice extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.slice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (Get O "length")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (ToLength __x3__)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    app __x5__ = (ToInteger start)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let relativeStart = __x5__
    if (< relativeStart 0i) {
      app __x6__ = (max (+ len relativeStart) 0i)
      let k = __x6__
    } else {
      app __x7__ = (min relativeStart len)
      let k = __x7__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x8__ = (ToInteger end)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let relativeEnd = __x8__
    }
    if (< relativeEnd 0i) {
      app __x9__ = (max (+ len relativeEnd) 0i)
      let final = __x9__
    } else {
      app __x10__ = (min relativeEnd len)
      let final = __x10__
    }
    app __x11__ = (max (- final k) 0i)
    let count = __x11__
    app __x12__ = (ArraySpeciesCreate O count)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let A = __x12__
    let n = 0i
    while (< k final) {
      app __x13__ = (ToString k)
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let Pk = __x13__
      app __x14__ = (HasProperty O Pk)
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let kPresent = __x14__
      if (= kPresent true) {
        app __x15__ = (Get O Pk)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        let kValue = __x15__
        app __x16__ = (ToString n)
        if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        app __x17__ = (CreateDataPropertyOrThrow A __x16__ kValue)
        if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
        __x17__
      } else {}
      k = (+ k 1i)
      n = (+ n 1i)
    }
    app __x18__ = (Set A "length" n true)
    if (is-completion __x18__) if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
    __x18__
    app __x19__ = (WrapCompletion A)
    return __x19__
  }""")
}
