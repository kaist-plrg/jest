package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement3LabelledEvaluation3 extends Algorithm {
  val name: String = "IterationStatement3LabelledEvaluation3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement3LabelledEvaluation3" (this, VariableDeclarationList, Expression0, Expression1, Statement, labelSet) => {
    access __x0__ = (VariableDeclarationList "Evaluation")
    let varDcl = __x0__
    if (is-completion varDcl) if (= varDcl["Type"] CONST_normal) varDcl = varDcl["Value"] else return varDcl else {}
    varDcl
    app __x1__ = (ForBodyEvaluation Expression0 Expression1 Statement (new []) labelSet)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
