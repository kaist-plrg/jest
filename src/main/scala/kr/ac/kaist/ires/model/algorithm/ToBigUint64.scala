package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToBigUint64 extends Algorithm {
  val name: String = "ToBigUint64"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToBigUint64" (argument) => {
    app __x0__ = (ToBigInt argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let n = __x0__
    let int64bit = (%% n 9223372036854775807i)
    app __x1__ = (WrapCompletion int64bit)
    return __x1__
  }"""), this)
}
