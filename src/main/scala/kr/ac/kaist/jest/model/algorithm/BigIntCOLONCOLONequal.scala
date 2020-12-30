package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BigIntCOLONCOLONequal extends Algorithm {
  val name: String = "BigIntCOLONCOLONequal"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONequal" (x, y) => return (= x y)"""), this)
}
