package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONremainder extends Algorithm {
  val name: String = "NumberCOLONCOLONremainder"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::remainder" (x, y) => {
    return (% x y)
  }"""), this)
}
