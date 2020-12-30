package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object floor extends Algorithm {
  val name: String = "floor"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""floor" (a) => {
    return (- a (% a 1))
  }"""), this)
}
