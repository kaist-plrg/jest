package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsInteger extends Algorithm {
  val name: String = "IsInteger"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsInteger" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Number)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (|| (|| (= argument NaN) (= argument Infinity)) (= argument -Infinity)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (abs argument)
    app __x4__ = (floor __x3__)
    app __x5__ = (abs argument)
    if (! (== __x4__ __x5__)) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (WrapCompletion true)
    return __x7__
  }"""), this)
}
