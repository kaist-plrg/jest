package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONsameValue extends Algorithm {
  val name: String = "BigIntCOLONCOLONsameValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::sameValue" (x, y) => !!! "Return BigInt : : equal ( id:{x} , id:{y} ) .""""), this)
}
