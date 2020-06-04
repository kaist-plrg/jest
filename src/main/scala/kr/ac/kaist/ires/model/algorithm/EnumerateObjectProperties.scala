package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnumerateObjectProperties extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""EnumerateObjectProperties" (O) => {
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    app __x1__ = (EnumerateObjectPropertiesHelper O (new []) (new []))
    app __x2__ = (CreateListIteratorRecord __x1__)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}
