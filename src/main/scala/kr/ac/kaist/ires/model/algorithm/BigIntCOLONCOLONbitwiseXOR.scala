package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONbitwiseXOR extends Algorithm {
  val name: String = "BigIntCOLONCOLONbitwiseXOR"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::bitwiseXOR" (x, y) => {
    app __x0__ = (BigIntBitwiseOp "^" x y)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
