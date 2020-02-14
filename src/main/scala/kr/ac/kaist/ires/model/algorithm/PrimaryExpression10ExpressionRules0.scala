package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression10ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10ExpressionRules0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "PrimaryExpression10ExpressionRules0" (this, RegularExpressionLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
