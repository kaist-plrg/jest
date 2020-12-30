package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTSetDOTprototypeDOTentries extends Algorithm {
  val name: String = "GLOBALDOTSetDOTprototypeDOTentries"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Set.prototype.entries" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (CreateSetIterator S CONST_keyPLUSvalue)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
