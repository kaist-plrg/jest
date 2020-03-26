package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFulfillPromise {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.FulfillPromise""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))), IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending"""))), ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""value""")))), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""fulfilled""")), IApp(Id("""__x2__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""value"""))))), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "GLOBAL.FulfillPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    assert (= promise["PromiseState"] "pending")
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x2__ = (TriggerPromiseReactions reactions value)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
