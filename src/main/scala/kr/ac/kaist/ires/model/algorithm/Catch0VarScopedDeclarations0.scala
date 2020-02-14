package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Catch0VarScopedDeclarations0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarScopedDeclarations""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "Catch0VarScopedDeclarations0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "VarScopedDeclarations")
    return __x0__
  }
  */
}
