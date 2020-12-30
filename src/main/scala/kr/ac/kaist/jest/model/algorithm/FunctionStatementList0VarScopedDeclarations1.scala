package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionStatementList0VarScopedDeclarations1 extends Algorithm {
  val name: String = "FunctionStatementList0VarScopedDeclarations1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionStatementList0VarScopedDeclarations1" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarScopedDeclarations")
    return __x0__
  }"""), this)
}
