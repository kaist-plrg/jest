package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0Evaluation0 extends Algorithm {
  val name: String = "FunctionExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0Evaluation0" (this, FormalParameters, FunctionBody) => {
    if true let strict = true else let strict = false
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope strict)
    let closure = __x1__
    app __x2__ = (MakeConstructor closure)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion closure)
    return __x3__
  }"""), this)
}
