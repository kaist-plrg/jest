package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ContinueStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ContinueStatement1Evaluation0""", List(Id("""this"""), Id("""LabelIdentifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_continue""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""label""")))))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "ContinueStatement1Evaluation0" (this, LabelIdentifier) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    app __x1__ = (WrapCompletion (new Completion("Type" -> CONST_continue, "Value" -> CONST_empty, "Target" -> label)))
    return __x1__
  }
  */
}
