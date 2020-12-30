package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object DeclarativeEnvironmentRecordDOTHasBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTHasBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    if (! (= envRec["SubMap"][N] absent)) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }"""), this)
}
