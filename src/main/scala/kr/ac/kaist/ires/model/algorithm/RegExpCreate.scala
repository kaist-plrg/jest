package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RegExpCreate {
  val func: Func = parseFunc(""""RegExpCreate" (pattern, flags) => {
    !!! "RegularExpression"
  }""")
}
