package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTGetBindingValue extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTGetBindingValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.GetBindingValue" (this, N, S) => ??? "ModuleEnvironmentRecord.GetBindingValue""""), this)
}
