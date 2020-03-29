package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = parseFunc(""""FormalParameterList1IsSimpleParameterList0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "IsSimpleParameterList")
    if (= __x0__ false) return false else {}
    access __x1__ = (FormalParameter "IsSimpleParameterList")
    return __x1__
  }""")
}
