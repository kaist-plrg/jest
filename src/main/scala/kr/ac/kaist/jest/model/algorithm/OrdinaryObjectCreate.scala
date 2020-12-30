package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryObjectCreate extends Algorithm {
  val name: String = "OrdinaryObjectCreate"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryObjectCreate" (proto, additionalInternalSlotsList) => {
    let internalSlotsList = (new ["Prototype", "Extensible"])
    if (! (= additionalInternalSlotsList absent)) app _ = (append internalSlotsList additionalInternalSlotsList) else {}
    app __x0__ = (MakeBasicObject internalSlotsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    O["Prototype"] = proto
    app __x1__ = (WrapCompletion O)
    return __x1__
  }"""), this)
}
