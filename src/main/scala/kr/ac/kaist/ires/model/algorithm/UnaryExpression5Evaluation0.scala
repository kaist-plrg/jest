package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression5Evaluation0 extends Algorithm {
  val name: String = "UnaryExpression5Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UnaryExpression5Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumeric __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app __x3__ = (Type oldValue)
    let T = __x3__
    !!! "Return ! id:{T} : : unaryMinus ( id:{oldValue} ) ."
  }"""), this)
}
