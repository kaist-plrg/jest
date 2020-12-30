package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoPrecision extends Algorithm {
  val name: String = "GLOBALDOTNumberDOTprototypeDOTtoPrecision"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Number.prototype.toPrecision" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.Number.prototype.toPrecision"

    app __x0__ = (GetArgument argumentsList 0i)
    let precision = __x0__
    app __x1__ = (thisNumberValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    if (= precision undefined) {
      app __x2__ = (ToString x)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (ToInteger precision)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let p = __x4__
    !!! "If id:{x} is value:{NaN} , return the String value:{\"NaN\"} ."
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (== x Infinity) {
      app __x5__ = (WrapCompletion (+ s "Infinity"))
      return __x5__
    } else {}
    if (|| (< p 1i) (< 100i p)) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    if (== x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      !!! "Etc"
      let m = !!! "StringOp"
      if (|| (< e (- 6i)) (! (< e p))) {
        assert (! (== e 0i))
        if (! (== p 1i)) {
          !!! "Etc"
          m = (+ (+ a ".") b)
        } else {}
        if (< 0i e) let c = "+" else {
          assert (< e 0i)
          let c = "-"
          e = (- e)
        }
        let d = !!! "StringOp"
        app __x7__ = (WrapCompletion (+ (+ (+ (+ s m) "e") c) d))
        return __x7__
      } else {}
    }
    if (== e (- p 1i)) {
      app __x8__ = (WrapCompletion (+ s m))
      return __x8__
    } else {}
    if (! (< e 0i)) !!! "Etc" else !!! "Etc"
    app __x9__ = (WrapCompletion (+ s m))
    return __x9__
  }"""), this)
}
