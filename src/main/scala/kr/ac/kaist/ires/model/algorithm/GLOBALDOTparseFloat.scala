package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseFloat {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (ToString string)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let inputString = __x1__
    app __x2__ = (TrimString inputString "start")
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trimmedString = __x2__
    !!! "Etc"
    !!! "Etc"
    access __x3__ = (numberString "MV")
    let mathFloat = __x3__
    !!! "Etc"
    !!! "Etc"
  }""")
}
