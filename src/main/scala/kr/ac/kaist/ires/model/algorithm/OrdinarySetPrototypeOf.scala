package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinarySetPrototypeOf extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""OrdinarySetPrototypeOf" (O, V) => {
    let extensible = O["Extensible"]
    let current = O["Prototype"]
    app __x0__ = (SameValue V current)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    if (= extensible false) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    let p = V
    let done = false
    while (= done false) if (= p null) done = true else {
      app __x3__ = (SameValue p O)
      if (= __x3__ true) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else if false done = true else p = p["Prototype"]
    }
    O["Prototype"] = V
    app __x5__ = (WrapCompletion true)
    return __x5__
  }""")
}
