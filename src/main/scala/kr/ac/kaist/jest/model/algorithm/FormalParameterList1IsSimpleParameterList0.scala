package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameterList1IsSimpleParameterList0 extends Algorithm {
  val name: String = "FormalParameterList1IsSimpleParameterList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameterList1IsSimpleParameterList0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "IsSimpleParameterList")
    if (= __x0__ false) return false else {}
    access __x1__ = (FormalParameter "IsSimpleParameterList")
    return __x1__
  }"""), this)
}
