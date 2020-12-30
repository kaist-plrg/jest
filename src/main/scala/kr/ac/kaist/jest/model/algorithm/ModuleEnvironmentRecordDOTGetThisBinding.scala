package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleEnvironmentRecordDOTGetThisBinding extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTGetThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.GetThisBinding" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }"""), this)
}
