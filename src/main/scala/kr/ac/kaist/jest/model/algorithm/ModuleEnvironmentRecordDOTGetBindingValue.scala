package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleEnvironmentRecordDOTGetBindingValue extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTGetBindingValue"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.GetBindingValue" (this, N, S) => ??? "ModuleEnvironmentRecord.GetBindingValue""""), this)
}
