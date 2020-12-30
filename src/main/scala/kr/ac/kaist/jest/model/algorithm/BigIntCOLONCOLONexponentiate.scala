package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONexponentiate extends Algorithm {
  val name: String = "BigIntCOLONCOLONexponentiate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::exponentiate" (base, exponent) => {
    if (< exponent 0n) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (&& (= base 0n) (= exponent 0n)) {
      app __x1__ = (WrapCompletion 1n)
      return __x1__
    } else {}
    return (** base exponent)
  }"""), this)
}
