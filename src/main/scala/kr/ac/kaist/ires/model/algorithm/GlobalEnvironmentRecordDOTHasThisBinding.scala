package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasThisBinding extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTHasThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }"""), this)
}
