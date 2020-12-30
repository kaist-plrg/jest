package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFunctionExpression0Evaluation0 extends Algorithm {
  val name: String = "AsyncFunctionExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionExpression0Evaluation0" (this, FormalParameters, AsyncFunctionBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app closure = (OrdinaryFunctionCreate INTRINSIC_AsyncFunctionPrototype FormalParameters AsyncFunctionBody CONST_nonlexicalthis scope)
    ! closure
    closure["SourceText"] = (get-syntax this)
    app __x1__ = (WrapCompletion closure)
    return __x1__
  }"""), this)
}
