package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakStatement1Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""BreakStatement1Evaluation0" (this, LabelIdentifier) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    app __x1__ = (WrapCompletion (new Completion("Type" -> CONST_break, "Value" -> CONST_empty, "Target" -> label)))
    return __x1__
  }""")
}
