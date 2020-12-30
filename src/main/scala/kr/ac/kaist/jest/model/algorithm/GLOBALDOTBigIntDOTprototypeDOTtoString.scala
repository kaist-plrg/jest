package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTBigIntDOTprototypeDOTtoString extends Algorithm {
  val name: String = "GLOBALDOTBigIntDOTprototypeDOTtoString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.BigInt.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let radix = __x0__
    app __x1__ = (thisBigIntValue this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    if (= argumentsList[0i] absent) let radixNumber = 10i else if (= radix undefined) let radixNumber = 10i else {
      app __x2__ = (ToInteger radix)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let radixNumber = __x2__
    }
    if (|| (< radixNumber 2i) (< 36i radixNumber)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (== radixNumber 10i) {
      app __x4__ = (ToString x)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    if (= x NaN) {
      app __x6__ = (WrapCompletion "NaN")
      return __x6__
    } else {}
    if (|| (= x 0i) (= x -0.0)) {
      app __x6__ = (WrapCompletion "0")
      return __x6__
    } else {}
    if (< x 0.0) {
      x = (- x)
      if (= x Infinity) {
        app __x6__ = (WrapCompletion "-Infinity")
        return __x6__
      } else {}
      let __x6__ = (+ "-" (convert x num2str radixNumber))
    } else {
      if (= x Infinity) {
        app __x6__ = (WrapCompletion "Infinity")
        return __x6__
      } else {}
      let __x6__ = (convert x num2str radixNumber)
    }
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
