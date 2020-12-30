package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrimaryExpression10Evaluation0 extends Algorithm {
  val name: String = "PrimaryExpression10Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression10Evaluation0" (this, RegularExpressionLiteral) => {
    access __x0__ = (RegularExpressionLiteral "BodyText")
    app __x1__ = (UTF16Encode __x0__)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let pattern = __x1__
    access __x2__ = (RegularExpressionLiteral "FlagText")
    app __x3__ = (UTF16Encode __x2__)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let flags = __x3__
    app __x4__ = (RegExpCreate pattern flags)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
