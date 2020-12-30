package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONunaryMinus extends Algorithm {
  val name: String = "NumberCOLONCOLONunaryMinus"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::unaryMinus" (x) => {
    if (= x NaN) {
      app __x0__ = (WrapCompletion NaN)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion (- x))
    return __x1__
  }"""), this)
}
