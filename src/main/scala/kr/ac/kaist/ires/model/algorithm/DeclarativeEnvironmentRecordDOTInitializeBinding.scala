package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTInitializeBinding {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""DeclarativeEnvironmentRecord.InitializeBinding" (this, N, V) => {
    let envRec = this
    envRec["SubMap"][N]["BoundValue"] = V
    if (! (= envRec["SubMap"][N] absent)) envRec["SubMap"][N]["initialized"] = true else {}
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
