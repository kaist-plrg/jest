package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowFunction0Contains0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ArrowFunction0Contains0" (this, ArrowParameters, ConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (ArrowParameters "Contains")
    app __x1__ = (__x0__ symbol)
    if (= __x1__ true) return true else {}
    access __x2__ = (ConciseBody "Contains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }""")
}
