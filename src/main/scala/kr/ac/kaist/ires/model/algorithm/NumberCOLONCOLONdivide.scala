package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONdivide extends Algorithm {
  val name: String = "NumberCOLONCOLONdivide"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::divide" (x, y) => {
    return (/ x y)
  }"""), this)
}
