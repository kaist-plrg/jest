package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionStatementList0VarDeclaredNames1 extends Algorithm {
  val name: String = "FunctionStatementList0VarDeclaredNames1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionStatementList0VarDeclaredNames1" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarDeclaredNames")
    return __x0__
  }"""), this)
}
