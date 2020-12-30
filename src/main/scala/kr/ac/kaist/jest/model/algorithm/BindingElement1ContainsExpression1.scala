package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElement1ContainsExpression1 extends Algorithm {
  val name: String = "BindingElement1ContainsExpression1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElement1ContainsExpression1" (this, BindingPattern, Initializer) => return true"""), this)
}
