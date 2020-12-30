package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingList1Evaluation0 extends Algorithm {
  val name: String = "BindingList1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingList1Evaluation0" (this, BindingList, LexicalBinding) => {
    access __x0__ = (BindingList "Evaluation")
    let next = __x0__
    if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    access __x1__ = (LexicalBinding "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
