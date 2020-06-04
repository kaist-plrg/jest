package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Construct extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""Construct" (F, argumentsList, newTarget) => {
    if (= newTarget absent) newTarget = F else {}
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x0__ = (IsConstructor F)
    assert (= __x0__ true)
    app __x1__ = (IsConstructor newTarget)
    assert (= __x1__ true)
    app __x2__ = (F["Construct"] F argumentsList newTarget)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
