package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTslice extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTslice"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.slice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (ToInteger start)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let relativeStart = __x4__
    if (< relativeStart 0i) {
      app __x5__ = (max (+ len relativeStart) 0i)
      let k = __x5__
    } else {
      app __x6__ = (min relativeStart len)
      let k = __x6__
    }
    if (= end undefined) let relativeEnd = len else {
      app __x7__ = (ToInteger end)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let relativeEnd = __x7__
    }
    if (< relativeEnd 0i) {
      app __x8__ = (max (+ len relativeEnd) 0i)
      let final = __x8__
    } else {
      app __x9__ = (min relativeEnd len)
      let final = __x9__
    }
    app __x10__ = (max (- final k) 0i)
    let count = __x10__
    app __x11__ = (ArraySpeciesCreate O count)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let A = __x11__
    let n = 0i
    while (< k final) {
      app __x12__ = (ToString k)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let Pk = __x12__
      app __x13__ = (HasProperty O Pk)
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let kPresent = __x13__
      if (= kPresent true) {
        app __x14__ = (Get O Pk)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let kValue = __x14__
        app __x15__ = (ToString n)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (CreateDataPropertyOrThrow A __x15__ kValue)
        if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        __x16__
      } else {}
      k = (+ k 1i)
      n = (+ n 1i)
    }
    app __x17__ = (Set A "length" n true)
    if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    __x17__
    app __x18__ = (WrapCompletion A)
    return __x18__
  }"""), this)
}
