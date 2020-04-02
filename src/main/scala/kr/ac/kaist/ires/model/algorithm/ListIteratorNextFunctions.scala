package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ListIteratorNextFunctions {
  val length: Int = 0
  val func: Func = parseFunc(""""ListIteratorNextFunctions" () => {
    let O = this
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    assert (! (= O["IteratedList"] absent))
    let list = O["IteratedList"]
    let index = O["ListNextIndex"]
    let len = list["length"]
    if (! (< index len)) {
      app __x1__ = (CreateIterResultObject undefined true)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    O["ListNextIndex"] = (+ index 1i)
    app __x3__ = (CreateIterResultObject list[index] false)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
