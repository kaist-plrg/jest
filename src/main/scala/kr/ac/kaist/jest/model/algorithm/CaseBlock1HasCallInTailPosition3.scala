package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CaseBlock1HasCallInTailPosition3 extends Algorithm {
  val name: String = "CaseBlock1HasCallInTailPosition3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseBlock1HasCallInTailPosition3" (this, CaseClauses0, DefaultClause, CaseClauses1, call) => {
    let has = false
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "HasCallInTailPosition")
      app __x1__ = (__x0__ call)
      let has = __x1__
    } else {}
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (DefaultClause "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    let has = __x4__
    if (= has true) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (! (= CaseClauses1 absent)) {
      access __x6__ = (CaseClauses1 "HasCallInTailPosition")
      app __x7__ = (__x6__ call)
      let has = __x7__
    } else {}
    app __x8__ = (WrapCompletion has)
    return __x8__
  }"""), this)
}
