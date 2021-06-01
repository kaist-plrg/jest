package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object YieldExpression1Evaluation0 extends Algorithm {
  val name: String = "YieldExpression1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""YieldExpression1Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetGeneratorKind )
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    if (= generatorKind CONST_async) {
      app __x3__ = (AsyncGeneratorYield value)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {
      app __x5__ = (CreateIterResultObject value false)
      app __x6__ = (GeneratorYield __x5__)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
  }"""), this)
}
