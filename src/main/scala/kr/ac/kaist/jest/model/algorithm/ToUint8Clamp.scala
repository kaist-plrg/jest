package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToUint8Clamp extends Algorithm {
  val name: String = "ToUint8Clamp"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToUint8Clamp" (argument) => {
    app __x0__ = (ToNumber argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (= number NaN) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    if (! (< 0i number)) {
      app __x2__ = (WrapCompletion 0i)
      return __x2__
    } else {}
    if (! (< number 255i)) {
      app __x3__ = (WrapCompletion 255i)
      return __x3__
    } else {}
    app __x4__ = (floor number)
    let f = __x4__
    if (< (+ f 0.5) number) {
      app __x5__ = (WrapCompletion (+ f 1i))
      return __x5__
    } else {}
    if (< number (+ f 0.5)) {
      app __x6__ = (WrapCompletion f)
      return __x6__
    } else {}
    if (= (% f 2i) 1i) return (+ f 1i)
    app __x7__ = (WrapCompletion f)
    return __x7__
  }"""), this)
}
