package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UTF16DecodeSurrogatePair extends Algorithm {
  val name: String = "UTF16DecodeSurrogatePair"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UTF16DecodeSurrogatePair" (lead, trail) => ??? "UTF16DecodeSurrogatePair""""), this)
}
