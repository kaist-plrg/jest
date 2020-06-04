package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTCreateImportBinding extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""ModuleEnvironmentRecord.CreateImportBinding" (this, N, M, N2) => {
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
