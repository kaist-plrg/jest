package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EqualityExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""EqualityExpression4Evaluation0" (this, EqualityExpression, RelationalExpression) => {
    access __x0__ = (EqualityExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (RelationalExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (StrictEqualityComparison rval lval)
    let r = __x4__
    if (= r true) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion true)
      return __x6__
    }
  }""")
}
