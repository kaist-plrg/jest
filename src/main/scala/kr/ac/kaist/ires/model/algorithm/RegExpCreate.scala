package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RegExpCreate extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""RegExpCreate" (pattern, flags) => {
    !!! "RegularExpression"
  }""")
}
