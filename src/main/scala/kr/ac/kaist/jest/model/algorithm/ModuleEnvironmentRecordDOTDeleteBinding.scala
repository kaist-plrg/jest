package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleEnvironmentRecordDOTDeleteBinding extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTDeleteBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.DeleteBinding" (this, N) => {}"""), this)
}
