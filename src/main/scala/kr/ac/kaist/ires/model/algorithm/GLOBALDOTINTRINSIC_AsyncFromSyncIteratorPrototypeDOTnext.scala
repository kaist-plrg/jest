package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTnext {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    app __x2__ = (Type O)
    if (|| (! (= __x2__ Object)) (= O["SyncIteratorRecord"] absent)) {
      let invalidIteratorError = (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [invalidIteratorError]))
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
      app __x4__ = (WrapCompletion promiseCapability["Promise"])
      return __x4__
    } else {}
    let syncIteratorRecord = O["SyncIteratorRecord"]
    app __x5__ = (IteratorNext syncIteratorRecord value)
    let result = __x5__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x6__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x6__) (! (= __x6__["Type"] CONST_normal))) return __x6__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x7__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
