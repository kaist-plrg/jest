package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "IterationStatement0VarDeclaredNames0" (this, Statement, Expression) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
