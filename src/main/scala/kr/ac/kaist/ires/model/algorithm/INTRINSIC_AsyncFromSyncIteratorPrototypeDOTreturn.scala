package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object INTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = parseFunc(""""INTRINSIC_AsyncFromSyncIteratorPrototype.return" (value) => {
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
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x4__ = (GetMethod syncIterator "return")
    let return = __x4__
    if (is-completion return) if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x6__ = (CreateIterResultObject value true)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let iterResult = __x6__
      app __x7__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
      app __x8__ = (WrapCompletion promiseCapability["Promise"])
      return __x8__
    } else {}
    app __x9__ = (Call return syncIterator (new [value]))
    let result = __x9__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x10__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x10__) (! (= __x10__["Type"] CONST_normal))) return __x10__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x11__ = (Type result)
    if (! (= __x11__ Object)) {
      app __x12__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      __x12__
      app __x13__ = (WrapCompletion promiseCapability["Promise"])
      return __x13__
    } else {}
    app __x14__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
    app __x15__ = (WrapCompletion __x14__)
    return __x15__
  }""")
}
