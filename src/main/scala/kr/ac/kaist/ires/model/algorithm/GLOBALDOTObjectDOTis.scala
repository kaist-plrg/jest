package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTis {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Object.is" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value1 = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value2 = __x1__
    app __x2__ = (SameValue value1 value2)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
