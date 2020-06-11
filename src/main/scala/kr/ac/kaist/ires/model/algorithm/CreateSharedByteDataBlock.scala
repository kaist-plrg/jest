package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSharedByteDataBlock extends Algorithm {
  val name: String = "CreateSharedByteDataBlock"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateSharedByteDataBlock" (size) => ??? "CreateSharedByteDataBlock""""), this)
}
