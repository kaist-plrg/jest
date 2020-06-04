package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableStatement0Evaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""VariableStatement0Evaluation0" (this, VariableDeclarationList) => {
    access __x0__ = (VariableDeclarationList "Evaluation")
    let next = __x0__
    if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }""")
}
