package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameterList1HasInitializer0 extends Algorithm {
  val name: String = "FormalParameterList1HasInitializer0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameterList1HasInitializer0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "HasInitializer")
    if (= __x0__ true) return true else {}
    access __x1__ = (FormalParameter "HasInitializer")
    return __x1__
  }"""), this)
}
