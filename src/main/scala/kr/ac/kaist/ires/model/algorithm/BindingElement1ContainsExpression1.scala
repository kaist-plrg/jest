package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElement1ContainsExpression1 extends Algorithm {
  val name: String = "BindingElement1ContainsExpression1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElement1ContainsExpression1" (this, BindingPattern, Initializer) => return true"""), this)
}
