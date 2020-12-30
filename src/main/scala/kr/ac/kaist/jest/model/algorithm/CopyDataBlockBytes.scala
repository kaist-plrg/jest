package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CopyDataBlockBytes extends Algorithm {
  val name: String = "CopyDataBlockBytes"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CopyDataBlockBytes" (toBlock, toIndex, fromBlock, fromIndex, count) => ??? "CopyDataBlockBytes""""), this)
}
