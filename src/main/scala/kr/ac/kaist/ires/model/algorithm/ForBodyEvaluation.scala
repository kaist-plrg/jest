package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForBodyEvaluation {
  val length: Int = 5
  val func: Func = Func("""ForBodyEvaluation""", List(Id("""test"""), Id("""increment"""), Id("""stmt"""), Id("""perIterationBindings"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreatePerIterationEnvironment"""))), List(ERef(RefId(Id("""perIterationBindings"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x0__""")))), IWhile(EBool(true), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""test"""))), EAbsent)), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""test"""))), EStr("""Evaluation""")), ILet(Id("""testRef"""), ERef(RefId(Id("""__x1__""")))), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""testRef"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), ILet(Id("""testValue"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""testValue"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))), IReturn(ERef(RefId(Id("""__x5__""")))))), ISeq(List())))), ISeq(List())), IAccess(Id("""__x6__"""), ERef(RefId(Id("""stmt"""))), EStr("""Evaluation""")), ILet(Id("""result"""), ERef(RefId(Id("""__x6__""")))), IApp(Id("""__x7__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""labelSet"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""V"""))))), IApp(Id("""__x9__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x8__"""))))), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))), IReturn(ERef(RefId(Id("""__x10__""")))))), ISeq(List())), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), ISeq(List())), IApp(Id("""__x11__"""), ERef(RefId(Id("""CreatePerIterationEnvironment"""))), List(ERef(RefId(Id("""perIterationBindings"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x11__""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""increment"""))), EAbsent)), ISeq(List(IAccess(Id("""__x12__"""), ERef(RefId(Id("""increment"""))), EStr("""Evaluation""")), ILet(Id("""incRef"""), ERef(RefId(Id("""__x12__""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""incRef"""))))), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""__x13__""")))))), ISeq(List()))))))))
  /* Beautified form:
  "ForBodyEvaluation" (test, increment, stmt, perIterationBindings, labelSet) => {
    let V = undefined
    app __x0__ = (CreatePerIterationEnvironment perIterationBindings)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    while true {
      if (! (= test absent)) {
        access __x1__ = (test "Evaluation")
        let testRef = __x1__
        app __x2__ = (GetValue testRef)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let testValue = __x2__
        app __x3__ = (ToBoolean testValue)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        if (= __x3__ false) {
          app __x4__ = (NormalCompletion V)
          app __x5__ = (WrapCompletion __x4__)
          return __x5__
        } else {}
      } else {}
      access __x6__ = (stmt "Evaluation")
      let result = __x6__
      app __x7__ = (LoopContinues result labelSet)
      if (= __x7__ false) {
        app __x8__ = (UpdateEmpty result V)
        app __x9__ = (Completion __x8__)
        app __x10__ = (WrapCompletion __x9__)
        return __x10__
      } else {}
      if (! (= result["Value"] CONST_empty)) V = result["Value"] else {}
      app __x11__ = (CreatePerIterationEnvironment perIterationBindings)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      if (! (= increment absent)) {
        access __x12__ = (increment "Evaluation")
        let incRef = __x12__
        app __x13__ = (GetValue incRef)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
      } else {}
    }
  }
  */
}
