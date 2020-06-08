package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONbitwiseOR extends Algorithm {
  val name: String = "NumberCOLONCOLONbitwiseOR"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::bitwiseOR" (x, y) => {
    app __x0__ = (NumberBitwiseOp !!! "|" x y)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
