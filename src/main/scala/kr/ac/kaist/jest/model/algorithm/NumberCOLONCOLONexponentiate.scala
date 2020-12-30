package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONexponentiate extends Algorithm {
  val name: String = "NumberCOLONCOLONexponentiate"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::exponentiate" (x, y) => {
    return (** x y)
  }"""), this)
}
