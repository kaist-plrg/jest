package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IfAbruptRejectPromise {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""IfAbruptRejectPromise" (value, capability) => {
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x0__ = (Call capability["Reject"] undefined (new [value["Value"]]))
      if (&& (is-completion __x0__) (! (= __x0__["Type"] CONST_normal))) return __x0__ else {}
      return capability["Promise"]
    } else {}
    value
  }""")
}
