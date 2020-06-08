package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONdivide extends Algorithm {
  val name: String = "BigIntCOLONCOLONdivide"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::divide" (x, y) => {
    if (= y !!! "0n") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    !!! "Let id:{quotient} be the mathematical value of id:{x} divided by id:{y} ."
    !!! "Return the BigInt value that represents id:{quotient} rounded towards 0 to the next integral value ."
  }"""), this)
}
