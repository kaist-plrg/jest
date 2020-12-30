package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LoopContinues extends Algorithm {
  val name: String = "LoopContinues"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LoopContinues" (completion, labelSet) => {
    if (= completion["Type"] CONST_normal) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    if (! (= completion["Type"] CONST_continue)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= completion["Target"] CONST_empty) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    if (contains labelSet completion["Target"]) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }"""), this)
}
