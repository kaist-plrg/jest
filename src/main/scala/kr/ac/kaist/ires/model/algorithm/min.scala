package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object min extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""min" (a, b) => {
    if (< a b) return a
    else return b
  }""")
}
