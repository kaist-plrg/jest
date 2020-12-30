package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StringPad extends Algorithm {
  val name: String = "StringPad"
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""StringPad" (O, maxLength, fillString, placement) => {
    assert (|| (= placement CONST_start) (= placement CONST_end))
    app __x0__ = (ToString O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let S = __x0__
    app __x1__ = (ToLength maxLength)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let intMaxLength = __x1__
    let stringLength = S["length"]
    if (! (< stringLength intMaxLength)) return S else {}
    if (= fillString undefined) let filler = " "  else {
      app __x2__ = (ToString fillString)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let filler = __x2__
    }
    if (= filler "") {
      app __x3__ = (WrapCompletion S)
      return __x3__
    } else {}
    let fillLen = (- intMaxLength stringLength)
    let truncatedStringFiller = ""
    let idx = 0i
    let mod = filler.length
    while (< idx fillLen) {
      truncatedStringFiller = (+ truncatedStringFiller filler[(% idx mod)])
      idx = (+ idx 1i)
    }
    if (= placement CONST_start) {
      app __x4__ = (WrapCompletion (+ truncatedStringFiller S))
      return __x4__
    } else {
      app __x5__ = (WrapCompletion (+ S truncatedStringFiller))
      return __x5__
    }
  }"""), this)
}
