package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTSet extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.Set" (O, P, V, Receiver) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""))
}
