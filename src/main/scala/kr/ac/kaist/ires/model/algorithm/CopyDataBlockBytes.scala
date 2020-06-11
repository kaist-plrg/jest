package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CopyDataBlockBytes extends Algorithm {
  val name: String = "CopyDataBlockBytes"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CopyDataBlockBytes" (toBlock, toIndex, fromBlock, fromIndex, count) => ??? "CopyDataBlockBytes""""), this)
}
