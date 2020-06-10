package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONmultiply extends Algorithm {
  val name: String = "BigIntCOLONCOLONmultiply"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigIntCOLONCOLONmultiply" (x, y) => return (* x y)"""), this)
}
