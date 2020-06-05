package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IdentifierReference1StringValue0 extends Algorithm {
  val name: String = "IdentifierReference1StringValue0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IdentifierReference1StringValue0" (this) => return "yield""""), this)
}
