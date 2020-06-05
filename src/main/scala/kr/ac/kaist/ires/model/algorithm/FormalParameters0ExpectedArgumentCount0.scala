package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters0ExpectedArgumentCount0 extends Algorithm {
  val name: String = "FormalParameters0ExpectedArgumentCount0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters0ExpectedArgumentCount0" (this) => return 0i"""), this)
}
