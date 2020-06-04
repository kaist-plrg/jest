package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement3VarDeclaredNames3 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""IterationStatement3VarDeclaredNames3" (this, VariableDeclarationList, Expression0, Expression1, Statement) => {
    access __x0__ = (VariableDeclarationList "BoundNames")
    let names = __x0__
    access __x1__ = (Statement "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }""")
}
