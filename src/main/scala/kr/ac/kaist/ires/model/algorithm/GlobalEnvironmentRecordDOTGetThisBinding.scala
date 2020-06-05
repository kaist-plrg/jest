package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTGetThisBinding extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTGetThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.GetThisBinding" (this) => {
    let envRec = this
    app __x0__ = (WrapCompletion envRec["GlobalThisValue"])
    return __x0__
  }"""), this)
}
