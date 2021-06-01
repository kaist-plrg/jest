package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object min extends Algorithm {
  val name: String = "min"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""min" (a, b) => {
    if (< a b) return a
    else return b
  }"""), this)
}
