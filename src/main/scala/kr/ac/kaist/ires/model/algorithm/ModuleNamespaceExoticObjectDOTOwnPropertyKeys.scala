package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.OwnPropertyKeys" (O) => {
    let exports = (copy-obj O["Exports"])
    app __x0__ = (OrdinaryOwnPropertyKeys O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let symbolKeys = __x0__
    !!! "Etc"
    app __x1__ = (WrapCompletion exports)
    return __x1__
  }"""))
}
