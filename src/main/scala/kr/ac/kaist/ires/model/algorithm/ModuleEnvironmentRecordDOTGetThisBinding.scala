package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ModuleEnvironmentRecord.GetThisBinding" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }""")
}
