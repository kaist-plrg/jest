package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Decode extends Algorithm {
  val name: String = "Decode"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""Decode" (string, reservedSet) => ??? "Decode""""), this)
}
