package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object UTF16Encode extends Algorithm {
  val name: String = "UTF16Encode"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UTF16Encode" (text) => ??? "UTF16Encode""""), this)
}
