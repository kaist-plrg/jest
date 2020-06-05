package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object floor extends Algorithm {
  val name: String = "floor"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""floor" (a) => {
    return (- a (% a 1))
  }"""), this)
}
