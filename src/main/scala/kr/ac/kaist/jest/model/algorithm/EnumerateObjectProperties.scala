package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object EnumerateObjectProperties extends Algorithm {
  val name: String = "EnumerateObjectProperties"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EnumerateObjectProperties" (O) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (EnumerateObjectPropertiesHelper O (new []) (new []))
    app __x2__ = (CreateListIteratorRecord __x1__)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
