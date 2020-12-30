package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONdivide extends Algorithm {
  val name: String = "NumberCOLONCOLONdivide"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::divide" (x, y) => {
    return (/ x y)
  }"""), this)
}
