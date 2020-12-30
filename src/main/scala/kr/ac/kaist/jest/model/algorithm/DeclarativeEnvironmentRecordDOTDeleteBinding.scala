package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object DeclarativeEnvironmentRecordDOTDeleteBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTDeleteBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    assert (! (= envRec["SubMap"][N] absent))
    if (! (= envRec.SubMap[N].maybeDeleted true)) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    delete envRec["SubMap"][N]
    app __x1__ = (WrapCompletion true)
    return __x1__
  }"""), this)
}
