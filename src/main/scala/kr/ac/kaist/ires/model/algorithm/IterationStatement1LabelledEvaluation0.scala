package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement1LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1LabelledEvaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef), IWhile(EBool(true), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""exprValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""labelSet"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""V"""))))), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x7__"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value""")))), ISeq(List()))))))))
  /* Beautified form:
  "IterationStatement1LabelledEvaluation0" (this, Expression, Statement, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Expression "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exprValue = __x1__
      app __x2__ = (ToBoolean exprValue)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      if (= __x2__ false) {
        app __x3__ = (NormalCompletion V)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      access __x5__ = (Statement "Evaluation")
      let stmtResult = __x5__
      app __x6__ = (LoopContinues stmtResult labelSet)
      if (= __x6__ false) {
        app __x7__ = (UpdateEmpty stmtResult V)
        app __x8__ = (Completion __x7__)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
    }
  }
  */
}
