package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTWithBaseObject extends Algorithm {
  val name: String = "GlobalEnvironmentRecordDOTWithBaseObject"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GlobalEnvironmentRecord.WithBaseObject" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }"""), this)
}
