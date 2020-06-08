package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONmultiply extends Algorithm {
  val name: String = "NumberCOLONCOLONmultiply"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::multiply" (x, y) => {
    return (* x y)
  }"""), this)
}
