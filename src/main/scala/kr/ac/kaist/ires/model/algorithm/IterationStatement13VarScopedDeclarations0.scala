package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement13VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement13VarScopedDeclarations0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "IterationStatement13VarScopedDeclarations0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
