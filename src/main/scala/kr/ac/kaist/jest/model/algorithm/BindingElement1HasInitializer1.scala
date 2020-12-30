package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElement1HasInitializer1 extends Algorithm {
  val name: String = "BindingElement1HasInitializer1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElement1HasInitializer1" (this, BindingPattern, Initializer) => return true"""), this)
}
