package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = parseFunc(""""ModuleNamespaceExoticObject.GetOwnProperty" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryGetOwnProperty O P)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (! (contains exports P)) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    app __x4__ = (O["Get"] O P O)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let value = __x4__
    app __x5__ = (WrapCompletion (new PropertyDescriptor("Value" -> value, "Writable" -> true, "Enumerable" -> true, "Configurable" -> false)))
    return __x5__
  }""")
}