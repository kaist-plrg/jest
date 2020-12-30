package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement0VarDeclaredNames0 extends Algorithm {
  val name: String = "IterationStatement0VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement0VarDeclaredNames0" (this, Statement, Expression) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }"""), this)
}
