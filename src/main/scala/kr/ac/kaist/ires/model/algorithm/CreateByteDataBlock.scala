package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateByteDataBlock extends Algorithm {
  val name: String = "CreateByteDataBlock"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateByteDataBlock" (size) => ??? "CreateByteDataBlock""""), this)
}
