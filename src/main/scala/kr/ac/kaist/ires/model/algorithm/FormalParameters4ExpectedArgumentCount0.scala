package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4ExpectedArgumentCount0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FormalParameters4ExpectedArgumentCount0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    return __x0__
  }""")
}
