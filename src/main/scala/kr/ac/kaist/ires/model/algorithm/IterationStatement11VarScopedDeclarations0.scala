package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement11VarScopedDeclarations0 extends Algorithm {
  val name: String = "IterationStatement11VarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement11VarScopedDeclarations0" (this, LeftHandSideExpression, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }"""), this)
}
