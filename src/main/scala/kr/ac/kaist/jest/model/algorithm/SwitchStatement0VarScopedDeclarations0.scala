package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SwitchStatement0VarScopedDeclarations0 extends Algorithm {
  val name: String = "SwitchStatement0VarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SwitchStatement0VarScopedDeclarations0" (this, Expression, CaseBlock) => {
    access __x0__ = (CaseBlock "VarScopedDeclarations")
    return __x0__
  }"""), this)
}
