package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AgentSignifier extends Algorithm {
  val name: String = "AgentSignifier"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AgentSignifier" () => ??? "AgentSignifier""""), this)
}
