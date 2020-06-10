package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONbitwiseNOT extends Algorithm {
  val name: String = "BigIntCOLONCOLONbitwiseNOT"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONbitwiseNOT" (x) => return (~ x)"""), this)
}
