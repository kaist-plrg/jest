package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0HasName0 extends Algorithm {
  val name: String = "ClassExpression0HasName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassExpression0HasName0" (this, ClassTail) => return false"""), this)
}
