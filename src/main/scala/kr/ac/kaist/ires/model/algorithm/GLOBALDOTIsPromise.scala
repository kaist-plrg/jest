package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTIsPromise extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.IsPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let x = __x0__
    app __x1__ = (Type x)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= x["PromiseState"] absent) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion true)
    return __x4__
  }""")
}
