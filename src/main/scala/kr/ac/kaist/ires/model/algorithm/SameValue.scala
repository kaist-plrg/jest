package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValue extends Algorithm {
  val name: String = "SameValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SameValue" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (|| (= __x3__ Number) (= __x3__ BigInt)) !!! "Return ! Type ( id:{x} ) : : sameValue ( id:{x} , id:{y} ) ." else {}
    app __x4__ = (SameValueNonNumeric x y)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
