package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceCreate extends Algorithm {
  val name: String = "ModuleNamespaceCreate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceCreate" (module, exports) => ??? "ModuleNamespaceCreate""""), this)
}
