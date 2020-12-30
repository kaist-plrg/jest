package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FormalParameters4IsSimpleParameterList0 extends Algorithm {
  val name: String = "FormalParameters4IsSimpleParameterList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters4IsSimpleParameterList0" (this, FormalParameterList, FunctionRestParameter) => return false"""), this)
}
