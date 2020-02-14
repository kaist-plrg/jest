package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression5ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""IdentifierName""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "CallExpression5ExpressionRules0" (this, CallExpression, IdentifierName) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
