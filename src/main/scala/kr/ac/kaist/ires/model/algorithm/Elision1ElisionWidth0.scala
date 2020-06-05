package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Elision1ElisionWidth0 extends Algorithm {
  val name: String = "Elision1ElisionWidth0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Elision1ElisionWidth0" (this, Elision) => {
    access __x0__ = (Elision "ElisionWidth")
    let preceding = __x0__
    return (+ preceding 1i)
  }"""), this)
}
