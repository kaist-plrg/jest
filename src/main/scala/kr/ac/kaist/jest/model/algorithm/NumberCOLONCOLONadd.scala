package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONadd extends Algorithm {
  val name: String = "NumberCOLONCOLONadd"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::add" (x, y) => {
    return (+ x y)
  }"""), this)
}
