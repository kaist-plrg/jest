package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UTF16DecodeSurrogatePair extends Algorithm {
  val name: String = "UTF16DecodeSurrogatePair"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UTF16DecodeSurrogatePair" (lead, trail) => ??? "UTF16DecodeSurrogatePair""""), this)
}
