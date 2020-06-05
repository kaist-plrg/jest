package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTHasThisBinding extends Algorithm {
  val name: String = "FunctionEnvironmentRecordDOTHasThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionEnvironmentRecord.HasThisBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "lexical") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {
      app __x1__ = (WrapCompletion true)
      return __x1__
    }
  }"""), this)
}
