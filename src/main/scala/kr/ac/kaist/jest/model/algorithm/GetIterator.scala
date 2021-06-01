package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetIterator extends Algorithm {
  val name: String = "GetIterator"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetIterator" (obj, hint, method) => {
    if (= hint absent) hint = CONST_sync else {}
    assert (|| (= hint CONST_sync) (= hint CONST_async))
    if (= method absent) if (= hint CONST_async) {
      app __x0__ = (GetMethod obj SYMBOL_asyncIterator)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      method = __x0__
      if (= method undefined) {
        app __x1__ = (GetMethod obj SYMBOL_iterator)
        if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let syncMethod = __x1__
        app __x2__ = (GetIterator obj CONST_sync syncMethod)
        if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let syncIteratorRecord = __x2__
        app __x3__ = (CreateAsyncFromSyncIterator syncIteratorRecord)
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {
      app __x5__ = (GetMethod obj SYMBOL_iterator)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      method = __x5__
    } else {}
    app __x6__ = (Call method obj)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let iterator = __x6__
    app __x7__ = (Type iterator)
    if (! (= __x7__ Object)) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app __x9__ = (GetV iterator "next")
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let nextMethod = __x9__
    let iteratorRecord = (new Record("Iterator" -> iterator, "NextMethod" -> nextMethod, "Done" -> false))
    app __x10__ = (WrapCompletion iteratorRecord)
    return __x10__
  }"""), this)
}
