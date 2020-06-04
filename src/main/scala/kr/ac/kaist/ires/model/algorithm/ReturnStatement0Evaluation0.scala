package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ReturnStatement0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ReturnStatement0Evaluation0" (this) => {
    app __x0__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> undefined, "Target" -> CONST_empty)))
    return __x0__
  }""")
}
