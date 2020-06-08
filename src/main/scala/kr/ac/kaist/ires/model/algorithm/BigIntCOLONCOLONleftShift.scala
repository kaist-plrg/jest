package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONleftShift extends Algorithm {
  val name: String = "BigIntCOLONCOLONleftShift"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::leftShift" (x, y) => {
    if (< y !!! "0n") !!! "Return the BigInt value that represents id:{x} ÷ 2 sup:{- id:{y} } , rounding down to the nearest integer , including for negative numbers ." else {}
    !!! "Return the BigInt value that represents id:{x} × 2 sup:{id:{y} } ."
  }"""), this)
}
