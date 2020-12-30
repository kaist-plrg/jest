package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONbitwiseOR extends Algorithm {
  val name: String = "BigIntCOLONCOLONbitwiseOR"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::bitwiseOR" (x, y) => {
    app __x0__ = (BigIntBitwiseOp "|" x y)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
