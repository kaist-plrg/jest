package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameter0IsSimpleParameterList0 extends Algorithm {
  val name: String = "FormalParameter0IsSimpleParameterList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameter0IsSimpleParameterList0" (this, BindingElement) => {
    access __x0__ = (BindingElement "IsSimpleParameterList")
    return __x0__
  }"""), this)
}
