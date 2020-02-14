package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UpdateEmpty {
  val length: Int = 2
  val func: Func = Func("""UpdateEmpty""", List(Id("""completionRecord"""), Id("""value""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""completionRecord""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""completionRecord"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefProp(RefId(Id("""completionRecord""")), EStr("""Type""")))), (EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Target"""), ERef(RefProp(RefId(Id("""completionRecord""")), EStr("""Target""")))))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "UpdateEmpty" (completionRecord, value) => {
    if (! (= completionRecord["Value"] CONST_empty)) {
      app __x0__ = (Completion completionRecord)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion (new Completion("Type" -> completionRecord["Type"], "Value" -> value, "Target" -> completionRecord["Target"])))
    return __x2__
  }
  */
}
