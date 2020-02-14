package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsInteger {
  val length: Int = 1
  val func: Func = Func("""IsInteger""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IIf(EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""argument"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""argument"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""argument"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x2__""")))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""abs"""))), List(ERef(RefId(Id("""argument"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""floor"""))), List(ERef(RefId(Id("""__x3__"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""abs"""))), List(ERef(RefId(Id("""argument"""))))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""__x5__"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List())), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))), IReturn(ERef(RefId(Id("""__x7__""")))))))
  /* Beautified form:
  "IsInteger" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Number)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (|| (|| (= argument NaN) (= argument Infinity)) (= argument -Infinity)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (abs argument)
    app __x4__ = (floor __x3__)
    app __x5__ = (abs argument)
    if (! (= __x4__ __x5__)) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (WrapCompletion true)
    return __x7__
  }
  */
}
