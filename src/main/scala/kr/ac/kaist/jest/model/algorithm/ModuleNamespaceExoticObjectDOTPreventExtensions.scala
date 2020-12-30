package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleNamespaceExoticObjectDOTPreventExtensions extends Algorithm {
  val name: String = "ModuleNamespaceExoticObjectDOTPreventExtensions"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.PreventExtensions" (O) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }"""), this)
}
