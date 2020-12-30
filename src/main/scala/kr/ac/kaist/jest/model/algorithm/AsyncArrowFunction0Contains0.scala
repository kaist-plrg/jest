package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncArrowFunction0Contains0 extends Algorithm {
  val name: String = "AsyncArrowFunction0Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncArrowFunction0Contains0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (AsyncConciseBody "Contains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }"""), this)
}
