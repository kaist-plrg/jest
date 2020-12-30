package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ModuleNamespaceExoticObjectDOTOwnPropertyKeys extends Algorithm {
  val name: String = "ModuleNamespaceExoticObjectDOTOwnPropertyKeys"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ModuleNamespaceExoticObject.OwnPropertyKeys" (O) => ??? "ModuleNamespaceExoticObject.OwnPropertyKeys""""), this)
}
