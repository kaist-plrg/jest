package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LiteralPropertyName2Evaluation0 extends Algorithm {
  val name: String = "LiteralPropertyName2Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LiteralPropertyName2Evaluation0" (this, NumericLiteral) => {
    access __x0__ = (NumericLiteral "NumericValue")
    let nbr = __x0__
    app __x1__ = (ToString nbr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
