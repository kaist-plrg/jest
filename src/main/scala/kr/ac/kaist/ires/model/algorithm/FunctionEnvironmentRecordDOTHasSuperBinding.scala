package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTHasSuperBinding extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FunctionEnvironmentRecord.HasSuperBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "lexical") {
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
  }""")
}
