package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NumberCOLONCOLONleftShift extends Algorithm {
  val name: String = "NumberCOLONCOLONleftShift"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Number::leftShift" (x, y) => {
    app __x0__ = (ToInt32 x)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let lnum = __x0__
    app __x1__ = (ToUint32 y)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let rnum = __x1__
    let shiftCount = (& rnum 31i)
    app __x2__ = (WrapCompletion (<< lnum shiftCount))
    return __x2__
  }"""), this)
}
