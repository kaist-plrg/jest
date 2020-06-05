package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RegExpCreate extends Algorithm {
  val name: String = "RegExpCreate"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""RegExpCreate" (pattern, flags) => {
    !!! "RegularExpression"
  }"""), this)
}
