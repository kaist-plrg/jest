package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONsignedRightShift extends Algorithm {
  val name: String = "BigIntCOLONCOLONsignedRightShift"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::signedRightShift" (x, y) => {
    app result = (PRIMITIVES.BigInt.leftShift x (- y))
    app wrapped = (WrapCompletion result)
    return wrapped
  }"""), this)
}
