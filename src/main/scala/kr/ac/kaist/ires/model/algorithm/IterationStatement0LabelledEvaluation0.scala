package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement0LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0LabelledEvaluation0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef), IWhile(EBool(true), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""labelSet"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""V"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x2__"""))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))), IReturn(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value""")))), ISeq(List())), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x5__""")))), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x6__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x6__"""))))), ISeq(List())), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""exprValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x7__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x7__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))), IReturn(ERef(RefId(Id("""__x9__""")))))), ISeq(List()))))))))
  /* Beautified form:
  "IterationStatement0LabelledEvaluation0" (this, Statement, Expression, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Statement "Evaluation")
      let stmtResult = __x0__
      app __x1__ = (LoopContinues stmtResult labelSet)
      if (= __x1__ false) {
        app __x2__ = (UpdateEmpty stmtResult V)
        app __x3__ = (Completion __x2__)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
      access __x5__ = (Expression "Evaluation")
      let exprRef = __x5__
      app __x6__ = (GetValue exprRef)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let exprValue = __x6__
      app __x7__ = (ToBoolean exprValue)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      if (= __x7__ false) {
        app __x8__ = (NormalCompletion V)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
    }
  }
  */
}
