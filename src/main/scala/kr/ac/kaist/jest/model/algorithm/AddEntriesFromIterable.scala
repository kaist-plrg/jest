package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AddEntriesFromIterable extends Algorithm {
  val name: String = "AddEntriesFromIterable"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AddEntriesFromIterable" (target, iterable, adder) => {
    app __x0__ = (IsCallable adder)
    if (= __x0__ false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetIterator iterable)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let iteratorRecord = __x2__
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let next = __x3__
      if (= next false) {
        app __x4__ = (WrapCompletion target)
        return __x4__
      } else {}
      app __x5__ = (IteratorValue next)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextItem = __x5__
      app __x6__ = (Type nextItem)
      if (! (= __x6__ Object)) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        let error = __x7__
        app __x8__ = (IteratorClose iteratorRecord error)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      app __x10__ = (Get nextItem "0")
      let k = __x10__
      app __x11__ = (IsAbruptCompletion k)
      if __x11__ {
        app __x12__ = (IteratorClose iteratorRecord k)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (WrapCompletion __x12__)
        return __x13__
      } else {}
      app __x14__ = (Get nextItem "1")
      let v = __x14__
      app __x15__ = (IsAbruptCompletion v)
      if __x15__ {
        app __x16__ = (IteratorClose iteratorRecord v)
        if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        app __x17__ = (WrapCompletion __x16__)
        return __x17__
      } else {}
      app __x18__ = (Call adder target (new [k["Value"], v["Value"]]))
      let status = __x18__
      app __x19__ = (IsAbruptCompletion status)
      if __x19__ {
        app __x20__ = (IteratorClose iteratorRecord status)
        if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        app __x21__ = (WrapCompletion __x20__)
        return __x21__
      } else {}
    }
  }"""), this)
}
