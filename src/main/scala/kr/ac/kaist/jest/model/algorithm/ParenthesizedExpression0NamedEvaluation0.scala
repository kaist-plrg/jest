package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ParenthesizedExpression0NamedEvaluation0 extends Algorithm {
  val name: String = "ParenthesizedExpression0NamedEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ParenthesizedExpression0NamedEvaluation0" (this, Expression, name) => {
    app __x0__ = (IsAnonymousFunctionDefinition Expression)
    assert (= __x0__ true)
    access __x1__ = (Expression "NamedEvaluation")
    app __x2__ = (__x1__ name)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
