package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAwait {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Await" (this, argumentsList, NewTarget) => {
    app __x0__ = (Await value)
    let completion = __x0__
  }""")
}