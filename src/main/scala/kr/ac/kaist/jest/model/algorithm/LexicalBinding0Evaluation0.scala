package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LexicalBinding0Evaluation0 extends Algorithm {
  val name: String = "LexicalBinding0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LexicalBinding0Evaluation0" (this, BindingIdentifier) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__)
    let lhs = __x1__
    app __x2__ = (InitializeReferencedBinding lhs undefined)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
