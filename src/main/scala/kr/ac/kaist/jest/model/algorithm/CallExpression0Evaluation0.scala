package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CallExpression0Evaluation0 extends Algorithm {
  val name: String = "CallExpression0Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CallExpression0Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead) => {
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
        let evalArg = argList[0i]
        let strictCaller = true
        let evalRealm = REALM
        app __x14__ = (PerformEval evalArg evalRealm strictCaller true)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        app __x15__ = (WrapCompletion __x14__)
        return __x15__
      } else {}
    } else {}
    let thisCall = this
    app __x16__ = (IsInTailPosition thisCall)
    let tailCall = __x16__
    app __x17__ = (EvaluateCall func ref arguments tailCall)
    if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    app __x18__ = (WrapCompletion __x17__)
    return __x18__
  }"""), this)
}
