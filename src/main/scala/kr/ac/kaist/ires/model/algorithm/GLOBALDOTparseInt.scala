package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseInt {
  val length: Int = 2
  val func: Func = parseFunc(""""GLOBAL.parseInt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let radix = __x1__
    app __x2__ = (ToString string)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let inputString = __x2__
    !!! "Etc"
    let sign = 1i
    !!! "Etc"
    !!! "Etc"
    app __x3__ = (ToInt32 radix)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let R = __x3__
    let stripPrefix = true
    if (! (== R 0i)) {
      if (|| (< R 2i) (< 36i R)) {
        app __x4__ = (WrapCompletion NaN)
        return __x4__
      } else {}
      if (! (== R 16i)) stripPrefix = false else {}
    } else R = 10i
    if (= stripPrefix true) !!! "Etc" else {}
    !!! "StringOp"
    if (= Z["length"] 0i) {
      app __x5__ = (WrapCompletion NaN)
      return __x5__
    } else {}
    let mathInt = !!! "NumberOp"
    if (== mathInt 0i) {
      if (== sign (- 1i)) {
        app __x6__ = (WrapCompletion -0.0)
        return __x6__
      } else {}
      app __x7__ = (WrapCompletion 0i)
      return __x7__
    } else {}
    !!! "Etc"
    app __x8__ = (WrapCompletion (* sign number))
    return __x8__
  }""")
}
