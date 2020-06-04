package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayLiteral0Evaluation1 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayLiteral0Evaluation1" (this, Elision) => {
    app __x0__ = (ArrayCreate 0i)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    if (= Elision absent) let pad = 0i else {
      access __x1__ = (Elision "ElisionWidth")
      let pad = __x1__
    }
    app __x2__ = (ToUint32 pad)
    app __x3__ = (Set array "length" __x2__ false)
    __x3__
    app __x4__ = (WrapCompletion array)
    return __x4__
  }"""))
}
