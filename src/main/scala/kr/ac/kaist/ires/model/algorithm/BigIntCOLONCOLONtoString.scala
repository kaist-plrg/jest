package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONtoString extends Algorithm {
  val name: String = "BigIntCOLONCOLONtoString"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::toString" (x) => {
    !!! "If id:{x} is less than zero , return the string - concatenation of the String value:{\"-\"} and ! BigInt : : toString ( - id:{x} ) ."
    app __x0__ = (WrapCompletion !!! "StringOp")
    return __x0__
  }"""), this)
}
