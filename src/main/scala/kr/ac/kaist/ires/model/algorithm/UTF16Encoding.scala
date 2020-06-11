package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UTF16Encoding extends Algorithm {
  val name: String = "UTF16Encoding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UTF16Encoding" (cp) => ??? "UTF16Encoding""""), this)
}
