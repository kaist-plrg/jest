package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression10Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10Evaluation0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, ISeq(List(ILet(Id("""pattern"""), ENotSupported("""StringOp""")), ILet(Id("""flags"""), ENotSupported("""StringOp""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""RegExpCreate"""))), List(ERef(RefId(Id("""pattern"""))), ERef(RefId(Id("""flags"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "PrimaryExpression10Evaluation0" (this, RegularExpressionLiteral) => {
    let pattern = !!! "StringOp"
    let flags = !!! "StringOp"
    app __x0__ = (RegExpCreate pattern flags)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
