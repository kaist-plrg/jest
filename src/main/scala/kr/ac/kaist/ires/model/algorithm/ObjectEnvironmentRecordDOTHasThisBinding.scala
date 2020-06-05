package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTHasThisBinding extends Algorithm {
  val name: String = "ObjectEnvironmentRecordDOTHasThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
