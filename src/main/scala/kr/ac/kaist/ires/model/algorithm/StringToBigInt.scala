package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringToBigInt extends Algorithm {
  val name: String = "StringToBigInt"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""StringToBigInt" (argument) => return (convert argument str2bigint)"""), this)
}
