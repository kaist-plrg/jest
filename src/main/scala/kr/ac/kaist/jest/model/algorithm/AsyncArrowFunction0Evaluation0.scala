package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncArrowFunction0Evaluation0 extends Algorithm {
  val name: String = "AsyncArrowFunction0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncArrowFunction0Evaluation0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    let parameters = AsyncArrowBindingIdentifier
    app closure = (OrdinaryFunctionCreate INTRINSIC_AsyncFunctionPrototype parameters AsyncConciseBody CONST_lexicalthis scope)
    ! closure
    closure["SourceText"] = (get-syntax this)
    app __x1__ = (WrapCompletion closure)
    return __x1__
  }"""), this)
}
