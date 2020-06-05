package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTIsExtensible extends Algorithm {
  val name: String = "ModuleNamespaceExoticObjectDOTIsExtensible"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.IsExtensible" (O) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
