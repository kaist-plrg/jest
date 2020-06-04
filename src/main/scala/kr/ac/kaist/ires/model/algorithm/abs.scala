package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object abs extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""abs" (a) => {
    if (= a (-0)) return 0
    else if (< a 0) return (- a)
    else return a
  }""")
}
