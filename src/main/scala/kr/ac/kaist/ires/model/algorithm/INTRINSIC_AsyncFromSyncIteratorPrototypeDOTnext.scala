package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext {
  val length: Int = 1
  val func: Func = parseFunc(""""INTRINSIC_AsyncFromSyncIteratorPrototype.next" (value) => {
    let O = this
    app __x0__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseCapability = __x0__
    app __x1__ = (Type O)
    if (|| (! (= __x1__ Object)) (= O["SyncIteratorRecord"] absent)) {
      let invalidIteratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x2__ = (Call promiseCapability["Reject"] undefined (new [invalidIteratorError]))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion promiseCapability["Promise"])
      return __x3__
    } else {}
    let syncIteratorRecord = O["SyncIteratorRecord"]
    app __x4__ = (IteratorNext syncIteratorRecord value)
    let result = __x4__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x6__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }""")
}
