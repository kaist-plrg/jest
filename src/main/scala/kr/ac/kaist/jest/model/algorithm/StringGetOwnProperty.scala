package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StringGetOwnProperty extends Algorithm {
  val name: String = "StringGetOwnProperty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StringGetOwnProperty" (S, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (! (= __x1__ String)) {
      app __x2__ = (WrapCompletion undefined)
      return __x2__
    } else {}
    app __x3__ = (CanonicalNumericIndexString P)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let index = __x3__
    if (= index undefined) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    app __x5__ = (IsInteger index)
    if (= __x5__ false) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {}
    if (= index -0.0) {
      app __x7__ = (WrapCompletion undefined)
      return __x7__
    } else {}
    let str = S["StringData"]
    app __x8__ = (Type str)
    assert (= __x8__ String)
    let len = str["length"]
    if (|| (< index 0i) (! (< index len))) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {}
    let resultStr = str[index]
    app __x10__ = (WrapCompletion (new PropertyDescriptor("Value" -> resultStr, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
    return __x10__
  }"""), this)
}
