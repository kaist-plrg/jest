package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UpdateEmpty extends Algorithm {
  val name: String = "UpdateEmpty"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UpdateEmpty" (completionRecord, value) => {
    if (! (= completionRecord["Value"] CONST_empty)) {
      app __x0__ = (Completion completionRecord)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion (new Completion("Type" -> completionRecord["Type"], "Value" -> value, "Target" -> completionRecord["Target"])))
    return __x2__
  }"""), this)
}
