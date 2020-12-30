package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberToBigInt extends Algorithm {
  val name: String = "NumberToBigInt"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""NumberToBigInt" (number) => {
    app __x0__ = (Type number)
    assert (= __x0__ Number)
    app __x1__ = (IsInteger number)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    return (convert number num2bigint )
  }"""), this)
}
