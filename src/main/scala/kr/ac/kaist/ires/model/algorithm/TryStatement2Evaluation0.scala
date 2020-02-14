package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2Evaluation0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")), ILet(Id("""B"""), ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""B""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""CatchClauseEvaluation""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefProp(RefId(Id("""B""")), EStr("""Value"""))))), ILet(Id("""C"""), ERef(RefId(Id("""__x2__""")))))), ILet(Id("""C"""), ERef(RefId(Id("""B"""))))), IAccess(Id("""__x3__"""), ERef(RefId(Id("""Finally"""))), EStr("""Evaluation""")), ILet(Id("""F"""), ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""F""")), ERef(RefId(Id("""C""")))), ISeq(List())), IApp(Id("""__x4__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""F"""))), EUndef)), IApp(Id("""__x5__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x4__"""))))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "TryStatement2Evaluation0" (this, Block, Catch, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    if (= B["Type"] CONST_throw) {
      access __x1__ = (Catch "CatchClauseEvaluation")
      app __x2__ = (__x1__ B["Value"])
      let C = __x2__
    } else let C = B
    access __x3__ = (Finally "Evaluation")
    let F = __x3__
    if (= F["Type"] CONST_normal) F = C else {}
    app __x4__ = (UpdateEmpty F undefined)
    app __x5__ = (Completion __x4__)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
