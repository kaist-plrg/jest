package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement2VarDeclaredNames7 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""IterationStatement2VarDeclaredNames7" (this, Expression0, Expression1, Expression2, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }""")
}
