package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTHasThisBinding extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTHasThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }"""), this)
}
