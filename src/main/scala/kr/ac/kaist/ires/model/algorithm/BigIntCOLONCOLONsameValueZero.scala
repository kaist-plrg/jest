package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

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
