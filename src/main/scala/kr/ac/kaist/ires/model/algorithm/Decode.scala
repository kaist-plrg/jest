package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Decode extends Algorithm {
  val name: String = "Decode"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""Decode" (string, reservedSet) => ??? "Decode""""), this)
}
