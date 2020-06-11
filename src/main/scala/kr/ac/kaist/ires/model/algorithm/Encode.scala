package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Encode extends Algorithm {
  val name: String = "Encode"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""Encode" (string, unescapedSet) => ??? "Encode""""), this)
}
