package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object min {
  val func: Func = parseFunc(""""min" (a, b) => {
    if (< a b) return a
    else return b
  }""")
}
