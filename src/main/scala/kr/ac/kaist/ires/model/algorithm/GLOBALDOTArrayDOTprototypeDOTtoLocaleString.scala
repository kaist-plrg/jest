package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTtoLocaleString extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTtoLocaleString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.toLocaleString" (this, argumentsList, NewTarget) => ??? "GLOBAL.Array.prototype.toLocaleString""""), this)
}
