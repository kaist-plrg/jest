package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToBigInt {
  val length: Int = 1
  val func: Func = parseFunc(""""ToBigInt" (argument) => {
    app __x0__ = (ToPrimitive argument Number)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let prim = __x0__
    !!! "Return the value that id:{prim} corresponds to in Table 12 ."
  }""")
}
