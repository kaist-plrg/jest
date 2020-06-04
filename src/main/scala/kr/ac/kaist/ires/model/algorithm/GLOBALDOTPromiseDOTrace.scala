package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTrace extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Promise.race" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    let C = this
    app __x1__ = (Type C)
    if (! (= __x1__ Object)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (NewPromiseCapability C)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promiseCapability = __x3__
    app __x4__ = (GetIterator iterable)
    let iteratorRecord = __x4__
    if (is-completion iteratorRecord) if (= iteratorRecord["Type"] CONST_normal) iteratorRecord = iteratorRecord["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [iteratorRecord["Value"]]))
      if (&& (is-completion __x5__) (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    iteratorRecord
    app __x6__ = (PerformPromiseRace iteratorRecord C promiseCapability)
    let result = __x6__
    app __x7__ = (IsAbruptCompletion result)
    if __x7__ {
      if (= iteratorRecord["Done"] false) {
        app __x8__ = (IteratorClose iteratorRecord result)
        result = __x8__
      } else {}
      if (is-completion result) if (= result["Type"] CONST_normal) result = result["Value"] else {
        app __x9__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (&& (is-completion __x9__) (! (= __x9__["Type"] CONST_normal))) return __x9__ else {}
        return promiseCapability["Promise"]
      } else {}
      result
    } else {}
    app __x10__ = (Completion result)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }"""))
}
