package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameters1IsSimpleParameterList0 extends Algorithm {
  val name: String = "FormalParameters1IsSimpleParameterList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters1IsSimpleParameterList0" (this, FunctionRestParameter) => {
    return false
  }"""), this)
}
