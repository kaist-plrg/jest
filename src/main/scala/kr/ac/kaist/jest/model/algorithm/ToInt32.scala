package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToInt32 extends Algorithm {
  val name: String = "ToInt32"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToInt32" (argument) => {
    app __x0__ = (ToNumber argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int32bit = (%% int 4294967296i)
    if (! (< int32bit 2147483648i)) {
      app __x2__ = (WrapCompletion (- int32bit 4294967296i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int32bit)
      return __x3__
    }
  }"""), this)
}
