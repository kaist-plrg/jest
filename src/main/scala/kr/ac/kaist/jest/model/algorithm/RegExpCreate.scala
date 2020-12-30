package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object RegExpCreate extends Algorithm {
  val name: String = "RegExpCreate"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""RegExpCreate" (pattern, flags) => ??? "RegExpCreate""""), this)
}
