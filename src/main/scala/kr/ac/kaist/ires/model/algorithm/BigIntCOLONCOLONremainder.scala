package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONremainder extends Algorithm {
  val name: String = "BigIntCOLONCOLONremainder"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BigInt::remainder" (n, d) => {
    if (= d !!! "0n") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (= n !!! "0n") {
      app __x1__ = (WrapCompletion !!! "0n")
      return __x1__
    } else {}
    !!! "Let id:{r} be the BigInt defined by the mathematical relation id:{r} = id:{n} - ( id:{d} × id:{q} ) where id:{q} is a BigInt that is negative only if id:{n} / id:{d} is negative and positive only if id:{n} / id:{d} is positive , and whose magnitude is as large as possible without exceeding the magnitude of the true mathematical quotient of id:{n} and id:{d} ."
    app __x2__ = (WrapCompletion r)
    return __x2__
  }"""), this)
}
