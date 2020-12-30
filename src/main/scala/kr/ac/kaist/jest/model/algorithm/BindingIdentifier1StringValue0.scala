package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingIdentifier1StringValue0 extends Algorithm {
  val name: String = "BindingIdentifier1StringValue0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingIdentifier1StringValue0" (this) => return "yield""""), this)
}
