package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseFloat extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (ToString string)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let inputString = __x1__
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    access __x2__ = (numberString "MV")
    let mathFloat = __x2__
    if (== mathFloat 0i) {
      !!! "Etc"
      app __x3__ = (WrapCompletion 0i)
      return __x3__
    } else {}
    !!! "Etc"
  }""")
}
