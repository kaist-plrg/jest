package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0IsFunctionDefinition0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""IsFunctionDefinition""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ParenthesizedExpression0IsFunctionDefinition0" (this, Expression) => {
    access __x0__ = (Expression "IsFunctionDefinition")
    return __x0__
  }
  */
}
