package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object VariableDeclarationList1Evaluation0 extends Algorithm {
  val name: String = "VariableDeclarationList1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""VariableDeclarationList1Evaluation0" (this, VariableDeclarationList, VariableDeclaration) => {
    access __x0__ = (VariableDeclarationList "Evaluation")
    let next = __x0__
    if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    access __x1__ = (VariableDeclaration "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
