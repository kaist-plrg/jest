package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Literal1Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Literal1Evaluation0" (this, BooleanLiteral) => {
    if (= (get-syntax BooleanLiteral) "false") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= (get-syntax BooleanLiteral) "true") {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
  }"""))
}
