package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern0BoundNames2 extends Algorithm {
  val name: String = "ArrayBindingPattern0BoundNames2"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayBindingPattern0BoundNames2" (this, Elision) => return (new [])"""), this)
}
