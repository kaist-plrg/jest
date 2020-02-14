package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0AssignmentTargetType0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""AssignmentTargetType""")), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "ParenthesizedExpression0AssignmentTargetType0" (this, Expression) => {
    access __x0__ = (Expression "AssignmentTargetType")
    return __x0__
  }
  */
}
