package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ArrowParameters1IteratorBindingInitialization0 extends Algorithm {
  val name: String = "ArrowParameters1IteratorBindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ArrowParameters1IteratorBindingInitialization0" (this, CoverParenthesizedExpressionAndArrowParameterList, iteratorRecord, environment) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "IteratorBindingInitialization")
    app __x2__ = (__x1__ iteratorRecord environment)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
