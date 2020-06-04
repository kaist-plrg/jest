package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTlastIndexOf extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.lastIndexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchElement = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fromIndex = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (Get O "length")
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (ToLength __x3__)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let len = __x4__
    if (= len 0i) {
      app __x5__ = (WrapCompletion (- 1i))
      return __x5__
    } else {}
    if (! (= argumentsList[1i] absent)) {
      app __x6__ = (ToInteger fromIndex)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let n = __x6__
    } else let n = (- len 1i)
    if (! (< n 0i)) if (= n -0.0) let k = 0i else {
      app __x7__ = (min n (- len 1i))
      let k = __x7__
    } else let k = (+ len n)
    while (! (< k 0i)) {
      app __x8__ = (ToString k)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (HasProperty O __x8__)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let kPresent = __x9__
      if (= kPresent true) {
        app __x10__ = (ToString k)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        app __x11__ = (Get O __x10__)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let elementK = __x11__
        app __x12__ = (StrictEqualityComparison searchElement elementK)
        let same = __x12__
        if (= same true) {
          app __x13__ = (WrapCompletion k)
          return __x13__
        } else {}
      } else {}
      k = (- k 1i)
    }
    app __x14__ = (WrapCompletion (- 1i))
    return __x14__
  }""")
}
