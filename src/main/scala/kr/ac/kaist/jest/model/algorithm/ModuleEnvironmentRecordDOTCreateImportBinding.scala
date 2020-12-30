package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleEnvironmentRecordDOTCreateImportBinding extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTCreateImportBinding"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.CreateImportBinding" (this, N, M, N2) => ??? "ModuleEnvironmentRecord.CreateImportBinding""""), this)
}
