package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTCreateImmutableBinding {
  val length: Int = 2
  val func: Func = parseFunc(""""DeclarativeEnvironmentRecord.CreateImmutableBinding" (this, N, S) => {
    let envRec = this
    envRec["SubMap"][N] = (new ImmutableBinding("initialized" -> false, "strict" -> S))
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}