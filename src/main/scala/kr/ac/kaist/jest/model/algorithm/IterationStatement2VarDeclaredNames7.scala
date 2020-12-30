package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement2VarDeclaredNames7 extends Algorithm {
  val name: String = "IterationStatement2VarDeclaredNames7"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement2VarDeclaredNames7" (this, Expression0, Expression1, Expression2, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }"""), this)
}
