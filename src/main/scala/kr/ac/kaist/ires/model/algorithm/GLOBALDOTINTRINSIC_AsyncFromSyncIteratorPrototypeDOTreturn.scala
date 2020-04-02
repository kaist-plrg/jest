package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return" (this, argumentsList, NewTarget) => {
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
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x5__ = (GetMethod syncIterator "return")
    let return = __x5__
    if (is-completion return) if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x6__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (is-completion __x6__) (! (= __x6__["Type"] CONST_normal))) return __x6__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x7__ = (CreateIterResultObject value true)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let iterResult = __x7__
      app __x8__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
      app __x9__ = (WrapCompletion promiseCapability["Promise"])
      return __x9__
    } else {}
    app __x10__ = (Call return syncIterator (new [value]))
    let result = __x10__
    if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x11__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (is-completion __x11__) (! (= __x11__["Type"] CONST_normal))) return __x11__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x12__ = (Type result)
    if (! (= __x12__ Object)) {
      app __x13__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      __x13__
      app __x14__ = (WrapCompletion promiseCapability["Promise"])
      return __x14__
    } else {}
    app __x15__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }""")
}
