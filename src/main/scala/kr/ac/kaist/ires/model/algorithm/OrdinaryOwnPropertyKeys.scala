package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryOwnPropertyKeys extends Algorithm {
  val name: String = "OrdinaryOwnPropertyKeys"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryOwnPropertyKeys" (O) => {
    let keys = (new [])
    let __x0__ = (new [])
    let __x1__ = (new [])
    let __x2__ = (new [])
    let __x3__ = (map-keys O["SubMap"])
    let __x4__ = __x3__
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let __x6__ = __x4__[__x5__]
      if (= (typeof __x6__) "Symbol") append __x6__ -> __x0__ else {
        app __x7__ = (CanonicalNumericIndexString __x6__)
        if (|| (= __x7__ undefined) (|| (< __x7__ 0.0) (< 4.294967295E9 __x7__))) append __x6__ -> __x1__ else append __x7__ -> __x2__
      }
      __x5__ = (+ __x5__ 1i)
    }
    while (< 0i __x2__["length"]) {
      let __x8__ = 0i
      let __x9__ = 0i
      while (< __x9__ __x2__["length"]) {
        if (< __x2__[__x9__] __x2__[__x8__]) __x8__ = __x9__ else {}
        __x9__ = (+ __x9__ 1i)
      }
      let __x10__ = (pop __x2__ __x8__)
      app __x11__ = (ToString __x10__)
      append __x11__ -> keys
    }
    let __x12__ = __x1__
    let __x13__ = 0i
    while (< __x13__ __x12__["length"]) {
      let __x6__ = __x12__[__x13__]
      append __x6__ -> keys
      __x13__ = (+ __x13__ 1i)
    }
    let __x14__ = __x0__
    let __x15__ = 0i
    while (< __x15__ __x14__["length"]) {
      let __x6__ = __x14__[__x15__]
      append __x6__ -> keys
      __x15__ = (+ __x15__ 1i)
    }
    return keys
    app __x16__ = (WrapCompletion keys)
    return __x16__
  }"""), this)
}
