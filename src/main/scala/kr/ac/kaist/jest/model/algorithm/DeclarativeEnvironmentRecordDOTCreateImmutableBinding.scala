package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object DeclarativeEnvironmentRecordDOTCreateImmutableBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTCreateImmutableBinding"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.CreateImmutableBinding" (this, N, S) => {
    let envRec = this
    envRec["SubMap"][N] = (new ImmutableBinding("initialized" -> false, "strict" -> S))
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
