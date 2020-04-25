package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTcodePointAt {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.String.prototype.codePointAt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let pos = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    app __x3__ = (ToInteger pos)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let position = __x3__
    let size = S["length"]
    if (|| (< position 0i) (! (< position size))) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    let first = !!! "StringOp"
    if (|| (< first 55296i) (|| (< 56319i first) (== (+ position 1i) size))) {
      app __x5__ = (WrapCompletion first)
      return __x5__
    } else {}
    let second = !!! "StringOp"
    if (|| (< second 56320i) (< 57343i second)) {
      app __x6__ = (WrapCompletion first)
      return __x6__
    } else {}
    app __x7__ = (UTF16Decode first second)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
