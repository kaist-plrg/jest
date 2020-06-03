package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Literal2Evaluation0 {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""Literal2Evaluation0" (this, NumericLiteral) => {
    access __x0__ = (NumericLiteral "MV")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
