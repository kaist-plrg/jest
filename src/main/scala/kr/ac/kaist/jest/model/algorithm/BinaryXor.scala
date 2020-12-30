package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BinaryXor extends Algorithm {
  val name: String = "BinaryXor"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BinaryXor" (x, y) => {
    assert (|| (= x 0i) (= x 1i))
    assert (|| (= y 0i) (= y 1i))
    if (&& (= x 1i) (= y 0i)) {
      app __x0__ = (WrapCompletion 1i)
      return __x0__
    } else if (&& (= x 0i) (= y 1i)) {
      app __x1__ = (WrapCompletion 1i)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion 0i)
      return __x2__
    }
  }"""), this)
}
