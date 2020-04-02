package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetMapDOTSYMBOL_species {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.getMap.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }""")
}