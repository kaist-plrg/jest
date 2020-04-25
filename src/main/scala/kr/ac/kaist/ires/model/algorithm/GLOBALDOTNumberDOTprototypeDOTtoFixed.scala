package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoFixed {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Number.prototype.toFixed" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (|| (< f 0i) (< 100i f)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= x NaN) {
      app __x4__ = (WrapCompletion "NaN")
      return __x4__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (! (< x 9223372036854775807i)) {
      app __x5__ = (ToString x)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let m = __x5__
    } else {
      !!! "Etc"
      if (== n 0i) let m = "0" else let m = !!! "StringOp"
      if (! (== f 0i)) {
        let k = m["length"]
        if (! (< f k)) {
          let z = !!! "StringOp"
          m = (+ z m)
          k = (+ f 1i)
        } else {}
        !!! "Etc"
        m = (+ (+ a ".") b)
      } else {}
    }
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }""")
}
