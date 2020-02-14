package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0Evaluation0""", List(Id("""this"""), Id("""Block"""), Id("""Catch""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")), ILet(Id("""B"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""B""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""CatchClauseEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefProp(RefId(Id("""B""")), EStr("""Value"""))))), ILet(Id("""C"""), ERef(RefId(Id("""__x2__""")))))), ILet(Id("""C"""), ERef(RefId(Id("""B"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""C"""))), EUndef)), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x3__"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))))
  /* Beautified form:
  "TryStatement0Evaluation0" (this, Block, Catch) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    if (= B["Type"] CONST_throw) {
      access __x1__ = (Catch "CatchClauseEvaluation")
      app __x2__ = (__x1__ B["Value"])
      let C = __x2__
    } else let C = B
    app __x3__ = (UpdateEmpty C undefined)
    app __x4__ = (Completion __x3__)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
