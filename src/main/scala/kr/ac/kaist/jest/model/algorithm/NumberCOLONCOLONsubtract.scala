package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONsubtract extends Algorithm {
  val name: String = "NumberCOLONCOLONsubtract"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::subtract" (x, y) => {
    return (- x y)
  }"""), this)
}
