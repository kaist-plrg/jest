package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoExponential {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Number.prototype.toExponential" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (= x NaN) {
      app __x3__ = (WrapCompletion "NaN")
      return __x3__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (== x Infinity) {
      app __x4__ = (WrapCompletion (+ s "Infinity"))
      return __x4__
    } else {}
    if (|| (< f 0i) (< 100i f)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (== x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      if (! (= fractionDigits undefined)) !!! "Etc" else !!! "Etc"
      let m = !!! "StringOp"
    }
    if (! (== f 0i)) {
      !!! "Etc"
      m = (+ (+ a ".") b)
    } else {}
    if (== e 0i) {
      let c = "+"
      let d = "0"
    } else {
      if (< 0i e) let c = "+" else {
        let c = "-"
        e = (- e)
      }
      let d = !!! "StringOp"
    }
    m = (+ (+ (+ m "e") c) d)
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }""")
}
