package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONmultiply extends Algorithm {
  val name: String = "NumberCOLONCOLONmultiply"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::multiply" (x, y) => {
    return (* x y)
  }"""), this)
}
