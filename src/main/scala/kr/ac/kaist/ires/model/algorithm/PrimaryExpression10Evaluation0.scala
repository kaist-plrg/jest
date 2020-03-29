package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression10Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""PrimaryExpression10Evaluation0" (this, RegularExpressionLiteral) => {
    let pattern = !!! "StringOp"
    let flags = !!! "StringOp"
    app __x0__ = (RegExpCreate pattern flags)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
