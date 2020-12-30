package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONlessThan extends Algorithm {
  val name: String = "BigIntCOLONCOLONlessThan"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONlessThan" (x, y) => return (< x y)"""), this)
}
