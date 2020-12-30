package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONunaryMinus extends Algorithm {
  val name: String = "BigIntCOLONCOLONunaryMinus"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::unaryMinus" (x) => {
    if (= x 0n) {
      app __x0__ = (WrapCompletion 0n)
      return __x0__
    } else {}
    return (- (convert x num2bigint ))
  }"""), this)
}
