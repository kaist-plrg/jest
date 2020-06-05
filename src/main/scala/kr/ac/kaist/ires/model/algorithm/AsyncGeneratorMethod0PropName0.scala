package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorMethod0PropName0 extends Algorithm {
  val name: String = "AsyncGeneratorMethod0PropName0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncGeneratorMethod0PropName0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }"""), this)
}
