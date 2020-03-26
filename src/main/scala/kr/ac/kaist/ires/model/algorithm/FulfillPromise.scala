package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FulfillPromise {
  val length: Int = 2
  val func: Func = Func("""FulfillPromise""", List(Id("""promise"""), Id("""value""")), None, ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending"""))), ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""value""")))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""fulfilled""")), IApp(Id("""__x0__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""value"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "FulfillPromise" (promise, value) => {
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x0__ = (TriggerPromiseReactions reactions value)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
