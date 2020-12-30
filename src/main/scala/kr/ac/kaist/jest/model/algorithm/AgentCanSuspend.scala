package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AgentCanSuspend extends Algorithm {
  val name: String = "AgentCanSuspend"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AgentCanSuspend" () => ??? "AgentCanSuspend""""), this)
}
