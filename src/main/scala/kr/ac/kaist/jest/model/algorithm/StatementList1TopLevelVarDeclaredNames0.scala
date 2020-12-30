package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StatementList1TopLevelVarDeclaredNames0 extends Algorithm {
  val name: String = "StatementList1TopLevelVarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementList1TopLevelVarDeclaredNames0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "TopLevelVarDeclaredNames")
    let names = __x0__
    access __x1__ = (StatementListItem "TopLevelVarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }"""), this)
}
