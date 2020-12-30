package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTtoLocaleString extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTtoLocaleString"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.toLocaleString" (this, argumentsList, NewTarget) => ??? "GLOBAL.Array.prototype.toLocaleString""""), this)
}
