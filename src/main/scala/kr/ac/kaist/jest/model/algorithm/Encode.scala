package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Encode extends Algorithm {
  val name: String = "Encode"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""Encode" (string, unescapedSet) => ??? "Encode""""), this)
}
