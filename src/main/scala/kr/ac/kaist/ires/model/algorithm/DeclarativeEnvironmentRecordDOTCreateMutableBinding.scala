package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTCreateMutableBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTCreateMutableBinding"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.CreateMutableBinding" (this, N, D) => {
    let envRec = this
    envRec["SubMap"][N] = (new MutableBinding("initialized" -> false))
    if (= D true) envRec.SubMap[N].maybeDeleted = true else {}
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
