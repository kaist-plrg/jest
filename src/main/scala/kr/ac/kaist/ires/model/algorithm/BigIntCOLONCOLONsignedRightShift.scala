package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

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
