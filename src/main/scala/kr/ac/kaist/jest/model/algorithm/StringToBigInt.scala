package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StringToBigInt extends Algorithm {
  val name: String = "StringToBigInt"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""StringToBigInt" (argument) => return (convert argument str2bigint)"""), this)
}
