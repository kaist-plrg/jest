package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONadd extends Algorithm {
  val name: String = "BigIntCOLONCOLONadd"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::add" (x, y) => return (+ x y)"""), this)
}
