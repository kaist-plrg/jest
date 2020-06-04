package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4VarDeclaredNames3 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""IterationStatement4VarDeclaredNames3" (this, LexicalDeclaration, Expression0, Expression1, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }""")
}
