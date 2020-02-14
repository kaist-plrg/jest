package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement10VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement10VarDeclaredNames0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "IterationStatement10VarDeclaredNames0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
