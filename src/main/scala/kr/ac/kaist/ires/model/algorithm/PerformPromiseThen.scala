package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseThen {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseThen""", List(Id("""promise"""), Id("""onFulfilled"""), Id("""onRejected"""), Id("""resultCapability""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPromise"""))), List(ERef(RefId(Id("""promise"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EAbsent)), ISeq(List()), IAssign(RefId(Id("""resultCapability""")), EUndef)), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFulfilled"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), IAssign(RefId(Id("""onFulfilled""")), EUndef), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onRejected"""))))), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), IAssign(RefId(Id("""onRejected""")), EUndef), ISeq(List())), ILet(Id("""fulfillReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Fulfill""")), (EStr("""Handler"""), ERef(RefId(Id("""onFulfilled"""))))))), ILet(Id("""rejectReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Reject""")), (EStr("""Handler"""), ERef(RefId(Id("""onRejected"""))))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending""")), ISeq(List(IAppend(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))), IAppend(ERef(RefId(Id("""rejectReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""fulfilled""")), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefId(Id("""value"""))))))), IExpr(ERef(RefId(Id("""__x3__""")))))), ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""rejected"""))), ILet(Id("""reason"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""handle"""))), IExpr(ERef(RefId(Id("""__x4__""")))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""rejectReaction"""))), ERef(RefId(Id("""reason"""))))))), IExpr(ERef(RefId(Id("""__x5__""")))))))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled""")), EBool(true)), IIf(EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EUndef), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x6__""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))), IReturn(ERef(RefId(Id("""__x7__"""))))))))))
  /* Beautified form:
  "PerformPromiseThen" (promise, onFulfilled, onRejected, resultCapability) => {
    app __x0__ = (IsPromise promise)
    assert (= __x0__ true)
    if (! (= resultCapability absent)) {} else resultCapability = undefined
    app __x1__ = (IsCallable onFulfilled)
    if (= __x1__ false) onFulfilled = undefined else {}
    app __x2__ = (IsCallable onRejected)
    if (= __x2__ false) onRejected = undefined else {}
    let fulfillReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Fulfill", "Handler" -> onFulfilled))
    let rejectReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Reject", "Handler" -> onRejected))
    if (= promise["PromiseState"] "pending") {
      append fulfillReaction -> promise["PromiseFulfillReactions"]
      append rejectReaction -> promise["PromiseRejectReactions"]
    } else if (= promise["PromiseState"] "fulfilled") {
      let value = promise["PromiseResult"]
      app __x3__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [fulfillReaction, value]))
      __x3__
    } else {
      assert (= promise["PromiseState"] "rejected")
      let reason = promise["PromiseResult"]
      if (= promise["PromiseIsHandled"] false) {
        app __x4__ = (HostPromiseRejectionTracker promise "handle")
        __x4__
      } else {}
      app __x5__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [rejectReaction, reason]))
      __x5__
    }
    promise["PromiseIsHandled"] = true
    if (= resultCapability undefined) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {
      app __x7__ = (WrapCompletion resultCapability["Promise"])
      return __x7__
    }
  }
  */
}
