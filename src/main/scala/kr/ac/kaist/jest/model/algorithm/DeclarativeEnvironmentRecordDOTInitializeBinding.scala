package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object DeclarativeEnvironmentRecordDOTInitializeBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTInitializeBinding"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.InitializeBinding" (this, N, V) => {
    let envRec = this
    envRec["SubMap"][N]["BoundValue"] = V
    if (! (= envRec["SubMap"][N] absent)) envRec["SubMap"][N]["initialized"] = true else {}
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
