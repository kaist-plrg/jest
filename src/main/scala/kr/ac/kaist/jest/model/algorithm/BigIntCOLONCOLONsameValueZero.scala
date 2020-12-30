package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONsameValueZero extends Algorithm {
  val name: String = "BigIntCOLONCOLONsameValueZero"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::sameValueZero" (x, y) => {
    app result = (PRIMITIVES.BigInt.equal x y)
    app wrapped = (WrapCompletion result)
    return wrapped
  }"""), this)
}
