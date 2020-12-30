package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoFixed extends Algorithm {
  val name: String = "GLOBALDOTNumberDOTprototypeDOTtoFixed"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Number.prototype.toFixed" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.Number.prototype.toFixed"

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
    !!! "If id:{x} is value:{NaN} , return the String value:{\"NaN\"} ."
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (! (< x 9223372036854775807i)) {
      app __x4__ = (ToString x)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let m = __x4__
    } else {
      !!! "Etc"
      !!! "If id:{n} = 0 , let id:{m} be the String value:{\"0\"} . Otherwise , let id:{m} be the String value consisting of the digits of the decimal representation of id:{n} ( in order , with no leading zeroes ) ."
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
    app __x5__ = (WrapCompletion (+ s m))
    return __x5__
  }"""), this)
}
