package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement6LabelledEvaluation0 extends Algorithm {
  val name: String = "IterationStatement6LabelledEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement6LabelledEvaluation0" (this, ForBinding, Expression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) Expression CONST_enumerate)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation ForBinding Statement keyResult CONST_enumerate CONST_varBinding labelSet)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
