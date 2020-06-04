package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ParenthesizedExpression0Evaluation0" (this, Expression) => {
    access __x0__ = (Expression "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
