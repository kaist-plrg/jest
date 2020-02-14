package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MultiplicativeExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MultiplicativeExpression1ExpressionRules0""", List(Id("""this"""), Id("""MultiplicativeExpression"""), Id("""MultiplicativeOperator"""), Id("""ExponentiationExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "MultiplicativeExpression1ExpressionRules0" (this, MultiplicativeExpression, MultiplicativeOperator, ExponentiationExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
