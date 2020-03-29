package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = parseFunc(""""DeclarativeEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    assert (! (= envRec["SubMap"][N] absent))
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion true)
    return __x0__
  }""")
}
