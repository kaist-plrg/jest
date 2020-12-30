package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object VariableStatement0VarDeclaredNames0 extends Algorithm {
  val name: String = "VariableStatement0VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""VariableStatement0VarDeclaredNames0" (this, VariableDeclarationList) => {
    access __x0__ = (VariableDeclarationList "BoundNames")
    return __x0__
  }"""), this)
}
