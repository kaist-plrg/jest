package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IfStatement0Evaluation0 extends Algorithm {
  val name: String = "IfStatement0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IfStatement0Evaluation0" (this, Expression, Statement0, Statement1) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let exprValue = __x2__
    if (= exprValue true) {
      access __x3__ = (Statement0 "Evaluation")
      let stmtCompletion = __x3__
    } else {
      access __x4__ = (Statement1 "Evaluation")
      let stmtCompletion = __x4__
    }
    app __x5__ = (UpdateEmpty stmtCompletion undefined)
    app __x6__ = (Completion __x5__)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
