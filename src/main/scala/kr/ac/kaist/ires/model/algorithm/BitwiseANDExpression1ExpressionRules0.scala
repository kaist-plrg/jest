package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseANDExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseANDExpression1ExpressionRules0""", List(Id("""this"""), Id("""BitwiseANDExpression"""), Id("""EqualityExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "BitwiseANDExpression1ExpressionRules0" (this, BitwiseANDExpression, EqualityExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
