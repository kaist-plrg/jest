package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters0ContainsExpression0 extends Algorithm {
  val name: String = "FormalParameters0ContainsExpression0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters0ContainsExpression0" (this) => return false"""), this)
}
