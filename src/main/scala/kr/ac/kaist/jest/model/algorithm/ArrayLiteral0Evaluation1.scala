package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrayLiteral0Evaluation1 extends Algorithm {
  val name: String = "ArrayLiteral0Evaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrayLiteral0Evaluation1" (this, Elision) => {
    app __x0__ = (ArrayCreate 0i)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    if (! (= Elision absent)) {
      access __x1__ = (Elision "ArrayAccumulation")
      app __x2__ = (__x1__ array 0i)
      let len = __x2__
      if (is-completion len) if (= len["Type"] CONST_normal) len = len["Value"] else return len else {}
      len
    } else {}
    app __x3__ = (WrapCompletion array)
    return __x3__
  }"""), this)
}
