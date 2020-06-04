package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DebuggerStatement0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""DebuggerStatement0Evaluation0" (this) => {
    if false {} else {
      app __x0__ = (NormalCompletion CONST_empty)
      let result = __x0__
    }
    app __x1__ = (WrapCompletion result)
    return __x1__
  }""")
}
