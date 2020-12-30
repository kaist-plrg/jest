package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToBigInt64 extends Algorithm {
  val name: String = "ToBigInt64"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToBigInt64" (argument) => {
    app __x0__ = (ToBigInt argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let n = __x0__
    let int64bit = (%% n 9223372036854775807i)
    if (! (< int64bit 9223372036854775807i)) {
      app __x1__ = (WrapCompletion (- int64bit 9223372036854775807i))
      return __x1__
    } else {
      app __x2__ = (WrapCompletion int64bit)
      return __x2__
    }
  }"""), this)
}
