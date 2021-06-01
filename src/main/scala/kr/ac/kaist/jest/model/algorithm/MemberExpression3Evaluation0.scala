package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MemberExpression3Evaluation0 extends Algorithm {
  val name: String = "MemberExpression3Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression3Evaluation0" (this, MemberExpression, TemplateLiteral) => {
    access __x0__ = (MemberExpression "Evaluation")
    let tagRef = __x0__
    app __x1__ = (GetValue tagRef)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let tagFunc = __x1__
    let thisCall = this
    app __x2__ = (IsInTailPosition thisCall)
    let tailCall = __x2__
    app __x3__ = (EvaluateCall tagFunc tagRef TemplateLiteral tailCall)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
