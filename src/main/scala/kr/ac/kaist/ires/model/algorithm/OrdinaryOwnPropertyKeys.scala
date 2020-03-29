package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryOwnPropertyKeys {
  val length: Int = 1
  val func: Func = parseFunc(""""OrdinaryOwnPropertyKeys" (O) => {
    let keys = (new [])
    let __x0__ = (map-keys O["SubMap"])
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> keys
      __x2__ = (+ __x2__ 1i)
    }
    return keys
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (WrapCompletion keys)
    return __x4__
  }""")
}
