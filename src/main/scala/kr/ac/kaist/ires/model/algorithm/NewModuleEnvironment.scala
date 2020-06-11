package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewModuleEnvironment extends Algorithm {
  val name: String = "NewModuleEnvironment"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewModuleEnvironment" (E) => ??? "NewModuleEnvironment""""), this)
}
