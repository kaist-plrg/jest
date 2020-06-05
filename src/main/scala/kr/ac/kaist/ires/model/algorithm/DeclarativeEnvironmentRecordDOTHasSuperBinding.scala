package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTHasSuperBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTHasSuperBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.HasSuperBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
