package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameter0IsSimpleParameterList0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FormalParameter0IsSimpleParameterList0" (this, BindingElement) => {
    access __x0__ = (BindingElement "IsSimpleParameterList")
    return __x0__
  }""")
}
