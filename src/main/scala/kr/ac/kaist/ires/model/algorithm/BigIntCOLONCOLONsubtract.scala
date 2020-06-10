package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONsubtract extends Algorithm {
  val name: String = "BigIntCOLONCOLONsubtract"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::subtract" (x, y) => return (- x y)"""), this)
}
