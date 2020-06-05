package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingIdentifier2StringValue0 extends Algorithm {
  val name: String = "BindingIdentifier2StringValue0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingIdentifier2StringValue0" (this) => return "await""""), this)
}
