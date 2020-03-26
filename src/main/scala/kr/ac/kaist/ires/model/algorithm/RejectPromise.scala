package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RejectPromise {
  val length: Int = 2
  val func: Func = Func("""RejectPromise""", List(Id("""promise"""), Id("""reason""")), None, ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending"""))), ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""reason""")))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""rejected""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""reject"""))), IExpr(ERef(RefId(Id("""__x0__""")))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""reason"""))))), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "RejectPromise" (promise, reason) => {
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseRejectReactions"]
    promise["PromiseResult"] = reason
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "rejected"
    if (= promise["PromiseIsHandled"] false) {
      app __x0__ = (HostPromiseRejectionTracker promise "reject")
      __x0__
    } else {}
    app __x1__ = (TriggerPromiseReactions reactions reason)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
