package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTDeleteBinding extends Algorithm {
  val name: String = "ModuleEnvironmentRecordDOTDeleteBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleEnvironmentRecord.DeleteBinding" (this, N) => {}"""), this)
}
