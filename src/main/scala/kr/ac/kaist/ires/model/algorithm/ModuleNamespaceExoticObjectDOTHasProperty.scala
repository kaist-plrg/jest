package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTHasProperty extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""ModuleNamespaceExoticObject.HasProperty" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryHasProperty O P)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (contains exports P) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }""")
}
