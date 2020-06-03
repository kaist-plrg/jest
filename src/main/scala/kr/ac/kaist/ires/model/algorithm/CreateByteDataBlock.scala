package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateByteDataBlock {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""CreateByteDataBlock" (size) => {
    assert (! (< size 0i))
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion db)
    return __x0__
  }""")
}
