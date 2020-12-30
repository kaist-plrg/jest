package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionExpression0Evaluation0 extends Algorithm {
  val name: String = "FunctionExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0Evaluation0" (this, FormalParameters, FunctionBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app closure = (OrdinaryFunctionCreate INTRINSIC_FunctionPrototype FormalParameters FunctionBody CONST_nonlexicalthis scope)
    app __x1__ = (MakeConstructor closure)
    __x1__
    closure["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }"""), this)
}
