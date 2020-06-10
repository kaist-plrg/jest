package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONequal extends Algorithm {
  val name: String = "BigIntCOLONCOLONequal"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONequal" (x, y) => return (= x y)"""), this)
}
