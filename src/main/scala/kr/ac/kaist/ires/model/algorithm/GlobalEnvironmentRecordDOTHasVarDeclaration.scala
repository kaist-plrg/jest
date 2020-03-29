package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasVarDeclaration {
  val length: Int = 1
  val func: Func = parseFunc(""""GlobalEnvironmentRecord.HasVarDeclaration" (this, N) => {
    let envRec = this
    let varDeclaredNames = envRec["VarNames"]
    if (contains varDeclaredNames N) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }""")
}
