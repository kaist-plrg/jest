package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorComplete extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IteratorComplete" (iterResult) => {
    app __x0__ = (Type iterResult)
    assert (= __x0__ Object)
    app __x1__ = (Get iterResult "done")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
