package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression0Evaluation0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverCallExpressionAndAsyncArrowHead"""))), EStr("""CoveredCallExpression""")), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""MemberExpression""")), ILet(Id("""memberExpr"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""expr"""))), EStr("""Arguments""")), ILet(Id("""arguments"""), ERef(RefId(Id("""__x2__""")))), IAccess(Id("""__x3__"""), ERef(RefId(Id("""memberExpr"""))), EStr("""Evaluation""")), ILet(Id("""ref"""), ERef(RefId(Id("""__x3__""")))), IIf(EIsCompletion(ERef(RefId(Id("""ref""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""ref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""ref""")), ERef(RefProp(RefId(Id("""ref""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""ref"""))))), ISeq(List())), IExpr(ERef(RefId(Id("""ref""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""func"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""ref"""))))), ILet(Id("""__x6__"""), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Reference"""))))), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""IsPropertyReference"""))), List(ERef(RefId(Id("""ref"""))))), ILet(Id("""__x8__"""), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false))), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""ref"""))))), IAssign(RefId(Id("""__x8__""")), EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EStr("""eval"""))))), ISeq(List())), IAssign(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x8__""")))))), ISeq(List())), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""INTRINSIC_eval"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x11__"""), ERef(RefId(Id("""arguments"""))), EStr("""ArgumentListEvaluation""")), IIf(EIsCompletion(ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x11__"""))))), ISeq(List())), ILet(Id("""argList"""), ERef(RefId(Id("""__x11__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argList""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x12__""")))))), ISeq(List())), ILet(Id("""evalText"""), ERef(RefProp(RefId(Id("""argList""")), EINum(0L)))), IIf(EBool(true), ILet(Id("""strictCaller"""), EBool(true)), ILet(Id("""strictCaller"""), EBool(false))), ILet(Id("""evalRealm"""), ERef(RefId(Id("""REALM""")))), IApp(Id("""__x13__"""), ERef(RefId(Id("""PerformEval"""))), List(ERef(RefId(Id("""evalText"""))), ERef(RefId(Id("""evalRealm"""))), ERef(RefId(Id("""strictCaller"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x13__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x13__"""))))), ISeq(List())), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))), IReturn(ERef(RefId(Id("""__x14__""")))))), ISeq(List())))), ISeq(List())), ILet(Id("""thisCall"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsInTailPosition"""))), List(ERef(RefId(Id("""thisCall"""))))), ILet(Id("""tailCall"""), ERef(RefId(Id("""__x15__""")))), IApp(Id("""__x16__"""), ERef(RefId(Id("""EvaluateCall"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""ref"""))), ERef(RefId(Id("""arguments"""))), ERef(RefId(Id("""tailCall"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x16__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x16__"""))))), ISeq(List())), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))), IReturn(ERef(RefId(Id("""__x17__""")))))))
  /* Beautified form:
  "CallExpression0Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead) => {
    access __x0__ = (CoverCallExpressionAndAsyncArrowHead "CoveredCallExpression")
    let expr = __x0__
    access __x1__ = (expr "MemberExpression")
    let memberExpr = __x1__
    access __x2__ = (expr "Arguments")
    let arguments = __x2__
    access __x3__ = (memberExpr "Evaluation")
    let ref = __x3__
    if (is-completion ref) if (= ref["Type"] CONST_normal) ref = ref["Value"] else return ref else {}
    ref
    app __x4__ = (GetValue ref)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let func = __x4__
    app __x5__ = (Type ref)
    let __x6__ = (= __x5__ Reference)
    if __x6__ {
      app __x7__ = (IsPropertyReference ref)
      let __x8__ = (= __x7__ false)
      if __x8__ {
        app __x9__ = (GetReferencedName ref)
        __x8__ = (= __x9__ "eval")
      } else {}
      __x6__ = __x8__
    } else {}
    if __x6__ {
      app __x10__ = (SameValue func INTRINSIC_eval)
      if (= __x10__ true) {
        access __x11__ = (arguments "ArgumentListEvaluation")
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let argList = __x11__
        if (= argList["length"] 0i) {
          app __x12__ = (WrapCompletion undefined)
          return __x12__
        } else {}
        let evalText = argList[0i]
        if true let strictCaller = true else let strictCaller = false
        let evalRealm = REALM
        app __x13__ = (PerformEval evalText evalRealm strictCaller true)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        app __x14__ = (WrapCompletion __x13__)
        return __x14__
      } else {}
    } else {}
    let thisCall = this
    app __x15__ = (IsInTailPosition thisCall)
    let tailCall = __x15__
    app __x16__ = (EvaluateCall func ref arguments tailCall)
    if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    app __x17__ = (WrapCompletion __x16__)
    return __x17__
  }
  */
}
