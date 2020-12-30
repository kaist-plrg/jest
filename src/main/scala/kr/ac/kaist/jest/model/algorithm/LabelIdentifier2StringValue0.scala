package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LabelIdentifier2StringValue0 extends Algorithm {
  val name: String = "LabelIdentifier2StringValue0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelIdentifier2StringValue0" (this) => return "await""""), this)
}
