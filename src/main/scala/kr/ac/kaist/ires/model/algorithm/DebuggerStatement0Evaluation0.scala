package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DebuggerStatement0Evaluation0 extends Algorithm {
  val name: String = "DebuggerStatement0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DebuggerStatement0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion CONST_empty)
    let result = __x0__
  }"""), this)
}
