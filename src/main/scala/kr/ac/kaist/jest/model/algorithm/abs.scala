package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object abs extends Algorithm {
  val name: String = "abs"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""abs" (a) => {
    if (= a (-0)) return 0
    else if (< a 0) return (- a)
    else return a
  }"""), this)
}
