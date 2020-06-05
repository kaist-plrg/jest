package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingIdentifier2BoundNames0 extends Algorithm {
  val name: String = "BindingIdentifier2BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingIdentifier2BoundNames0" (this) => return (new ["await"])"""), this)
}
