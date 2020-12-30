package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONremainder extends Algorithm {
  val name: String = "BigIntCOLONCOLONremainder"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::remainder" (n, d) => {
    if (= d 0n) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (= n 0n) {
      app __x1__ = (WrapCompletion 0n)
      return __x1__
    } else {}
    let r = (% n d)
    app __x2__ = (WrapCompletion r)
    return __x2__
  }"""), this)
}
