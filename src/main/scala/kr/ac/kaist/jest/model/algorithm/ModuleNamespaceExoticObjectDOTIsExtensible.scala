package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleNamespaceExoticObjectDOTIsExtensible extends Algorithm {
  val name: String = "ModuleNamespaceExoticObjectDOTIsExtensible"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.IsExtensible" (O) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
