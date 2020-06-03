package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTHasBinding {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""DeclarativeEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    if (! (= envRec["SubMap"][N] absent)) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }""")
}
