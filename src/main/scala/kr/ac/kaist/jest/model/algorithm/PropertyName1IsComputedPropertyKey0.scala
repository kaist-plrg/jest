package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PropertyName1IsComputedPropertyKey0 extends Algorithm {
  val name: String = "PropertyName1IsComputedPropertyKey0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyName1IsComputedPropertyKey0" (this, ComputedPropertyName) => return true"""), this)
}
