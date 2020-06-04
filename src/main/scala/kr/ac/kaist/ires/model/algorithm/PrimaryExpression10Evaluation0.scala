package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression10Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrimaryExpression10Evaluation0" (this, RegularExpressionLiteral) => {
    access __x0__ = (RegularExpressionLiteral "BodyText")
    let pattern = __x0__
    access __x1__ = (RegularExpressionLiteral "FlagText")
    let flags = __x1__
    app __x2__ = (RegExpCreate pattern flags)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""))
}
