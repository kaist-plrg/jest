package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList1ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ClassElementList1ComputedPropertyContains0" (this, ClassElementList, ClassElement, symbol) => {
    access __x0__ = (ClassElementList "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    let inList = __x1__
    if (= inList true) return true else {}
    access __x2__ = (ClassElement "ComputedPropertyContains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }""")
}
