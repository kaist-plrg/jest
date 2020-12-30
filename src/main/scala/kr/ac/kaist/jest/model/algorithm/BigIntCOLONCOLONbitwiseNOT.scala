package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONbitwiseNOT extends Algorithm {
  val name: String = "BigIntCOLONCOLONbitwiseNOT"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONbitwiseNOT" (x) => return (~ x)"""), this)
}
