package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONsameValue extends Algorithm {
  val name: String = "BigIntCOLONCOLONsameValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::sameValue" (x, y) => {
    app result = (PRIMITIVES.BigInt.equal x y)
    app wrapped = (WrapCompletion result)
    return wrapped
  }"""), this)
}
