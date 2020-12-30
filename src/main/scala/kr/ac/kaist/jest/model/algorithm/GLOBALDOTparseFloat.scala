package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTparseFloat extends Algorithm {
  val name: String = "GLOBALDOTparseFloat"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.parseFloat"

    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (ToString string)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let inputString = __x1__
    app __x2__ = (TrimString inputString CONST_start)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trimmedString = __x2__
    !!! "If neither id:{trimmedString} nor any prefix of id:{trimmedString} satisfies the syntax of a nt:{StrDecimalLiteral} ( see 7 . 1 . 4 . 1 ) , return value:{NaN} ."
    !!! "Etc"
    access __x3__ = (numberString "MV")
    let mathFloat = __x3__
    !!! "Etc"
    !!! "Etc"
  }"""), this)
}
