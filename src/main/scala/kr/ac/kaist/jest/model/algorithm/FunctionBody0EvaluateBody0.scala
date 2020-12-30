package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionBody0EvaluateBody0 extends Algorithm {
  val name: String = "FunctionBody0EvaluateBody0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionBody0EvaluateBody0" (this, FunctionStatementList, functionObject, argumentsList) => {
    app __x0__ = (FunctionDeclarationInstantiation functionObject argumentsList)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (FunctionStatementList "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
