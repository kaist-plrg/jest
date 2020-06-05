package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters1ExpectedArgumentCount0 extends Algorithm {
  val name: String = "FormalParameters1ExpectedArgumentCount0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters1ExpectedArgumentCount0" (this, FunctionRestParameter) => {
    return 0
  }"""), this)
}
