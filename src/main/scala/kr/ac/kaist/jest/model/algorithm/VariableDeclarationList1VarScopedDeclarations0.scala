package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object VariableDeclarationList1VarScopedDeclarations0 extends Algorithm {
  val name: String = "VariableDeclarationList1VarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""VariableDeclarationList1VarScopedDeclarations0" (this, VariableDeclarationList, VariableDeclaration) => {
    access __x0__ = (VariableDeclarationList "VarScopedDeclarations")
    let declarations = __x0__
    append VariableDeclaration -> declarations
    return declarations
  }"""), this)
}
