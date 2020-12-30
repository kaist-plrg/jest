package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IdentifierReference2StringValue0 extends Algorithm {
  val name: String = "IdentifierReference2StringValue0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IdentifierReference2StringValue0" (this) => return "await""""), this)
}
