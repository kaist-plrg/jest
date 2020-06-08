package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UTF16Encode extends Algorithm {
  val name: String = "UTF16Encode"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UTF16Encode" (text) => !!! "Return the string - concatenation of the code units that are the UTF16Encoding of each code point in id:{text} , in order .""""), this)
}
