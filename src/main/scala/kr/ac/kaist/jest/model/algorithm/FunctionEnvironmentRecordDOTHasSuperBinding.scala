package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionEnvironmentRecordDOTHasSuperBinding extends Algorithm {
  val name: String = "FunctionEnvironmentRecordDOTHasSuperBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionEnvironmentRecord.HasSuperBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] CONST_lexical) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= envRec["HomeObject"] undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion true)
      return __x2__
    }
  }"""), this)
}
