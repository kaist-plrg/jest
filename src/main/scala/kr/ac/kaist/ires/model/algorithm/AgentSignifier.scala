package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentSignifier extends Algorithm {
  val name: String = "AgentSignifier"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AgentSignifier" () => ??? "AgentSignifier""""), this)
}
