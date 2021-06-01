package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToLength extends Algorithm {
  val name: String = "ToLength"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToLength" (argument) => {
    app __x0__ = (ToInteger argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let len = __x0__
    if (! (< 0i len)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    app __x2__ = (min len (- 9007199254740992i 1i))
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
