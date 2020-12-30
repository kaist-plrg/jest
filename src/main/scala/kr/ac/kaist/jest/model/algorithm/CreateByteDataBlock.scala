package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CreateByteDataBlock extends Algorithm {
  val name: String = "CreateByteDataBlock"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CreateByteDataBlock" (size) => ??? "CreateByteDataBlock""""), this)
}
