package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IdentifierReference0Evaluation0 extends Algorithm {
  val name: String = "IdentifierReference0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IdentifierReference0Evaluation0" (this, Identifier) => {
    access __x0__ = (Identifier "StringValue")
    app __x1__ = (ResolveBinding __x0__)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
