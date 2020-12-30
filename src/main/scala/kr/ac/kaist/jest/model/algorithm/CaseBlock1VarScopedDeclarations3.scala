package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CaseBlock1VarScopedDeclarations3 extends Algorithm {
  val name: String = "CaseBlock1VarScopedDeclarations3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseBlock1VarScopedDeclarations3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "VarScopedDeclarations")
      let declarations = __x0__
    } else let declarations = (new [])
    access __x1__ = (DefaultClause "VarScopedDeclarations")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> declarations
      __x3__ = (+ __x3__ 1i)
    }
    if (= CaseClauses1 absent) return declarations else {}
    access __x5__ = (CaseClauses1 "VarScopedDeclarations")
    let __x6__ = 0i
    while (< __x6__ __x5__["length"]) {
      let __x7__ = __x5__[__x6__]
      append __x7__ -> declarations
      __x6__ = (+ __x6__ 1i)
    }
    return declarations
  }"""), this)
}
