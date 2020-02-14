package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression8ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression8ExpressionRules0""", List(Id("""this"""), Id("""AwaitExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "UnaryExpression8ExpressionRules0" (this, AwaitExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
