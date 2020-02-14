package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Catch0VarDeclaredNames0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "Catch0VarDeclaredNames0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "VarDeclaredNames")
    return __x0__
  }
  */
}
