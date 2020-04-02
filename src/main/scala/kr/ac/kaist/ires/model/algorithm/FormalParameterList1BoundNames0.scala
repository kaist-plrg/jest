package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1BoundNames0 {
  val length: Int = 0
  val func: Func = parseFunc(""""FormalParameterList1BoundNames0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "BoundNames")
    let names = __x0__
    access __x1__ = (FormalParameter "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }""")
}