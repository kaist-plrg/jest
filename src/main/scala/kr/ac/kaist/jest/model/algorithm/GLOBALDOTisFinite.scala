package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTisFinite extends Algorithm {
  val name: String = "GLOBALDOTisFinite"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.isFinite" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (ToNumber number)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let num = __x1__
    if (|| (|| (= num NaN) (= num Infinity)) (= num -Infinity)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion true)
      return __x3__
    }
  }"""), this)
}
