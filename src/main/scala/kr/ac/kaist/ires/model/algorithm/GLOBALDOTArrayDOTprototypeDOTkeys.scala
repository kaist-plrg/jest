package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTkeys extends Algorithm {
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.keys" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (CreateArrayIterator O "key")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
