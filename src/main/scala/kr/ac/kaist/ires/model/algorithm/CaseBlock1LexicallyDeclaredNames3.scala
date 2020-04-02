package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1LexicallyDeclaredNames3 {
  val length: Int = 0
  val func: Func = parseFunc(""""CaseBlock1LexicallyDeclaredNames3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "LexicallyDeclaredNames")
      let names = __x0__
    } else let names = (new [])
    access __x1__ = (DefaultClause "LexicallyDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    if (= CaseClauses1 absent) return names else {}
    !!! "Etc"
  }""")
}