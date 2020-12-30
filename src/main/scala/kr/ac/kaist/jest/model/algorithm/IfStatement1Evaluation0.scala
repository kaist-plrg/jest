package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IfStatement1Evaluation0 extends Algorithm {
  val name: String = "IfStatement1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IfStatement1Evaluation0" (this, Expression, Statement) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let exprValue = __x2__
    if (= exprValue false) {
      app __x3__ = (NormalCompletion undefined)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {
      access __x5__ = (Statement "Evaluation")
      let stmtCompletion = __x5__
      app __x6__ = (UpdateEmpty stmtCompletion undefined)
      app __x7__ = (Completion __x6__)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    }
  }"""), this)
}
