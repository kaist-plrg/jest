package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONbitwiseXOR extends Algorithm {
  val name: String = "NumberCOLONCOLONbitwiseXOR"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::bitwiseXOR" (x, y) => {
    app __x0__ = (NumberBitwiseOp "^" x y)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
