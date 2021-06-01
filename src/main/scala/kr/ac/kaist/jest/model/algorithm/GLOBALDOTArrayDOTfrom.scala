package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTfrom extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTfrom"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.from" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let items = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let mapfn = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let thisArg = __x2__
    let C = this
    if (= mapfn undefined) let mapping = false else {
      app __x3__ = (IsCallable mapfn)
      if (= __x3__ false) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      let mapping = true
    }
    app __x5__ = (GetMethod items SYMBOL_iterator)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let usingIterator = __x5__
    if (! (= usingIterator undefined)) {
      app __x6__ = (IsConstructor C)
      if (= __x6__ true) {
        app __x7__ = (Construct C)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let A = __x7__
      } else {
        app __x8__ = (ArrayCreate 0i)
        if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let A = __x8__
      }
      app __x9__ = (GetIterator items CONST_sync usingIterator)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let iteratorRecord = __x9__
      let k = 0i
      while true {
        if (! (< k (- 9007199254740992i 1i))) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          let error = __x10__
          app __x11__ = (IteratorClose iteratorRecord error)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          app __x12__ = (WrapCompletion __x11__)
          return __x12__
        } else {}
        app __x13__ = (ToString k)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        let Pk = __x13__
        app __x14__ = (IteratorStep iteratorRecord)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let next = __x14__
        if (= next false) {
          app __x15__ = (Set A "length" k true)
          if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          __x15__
          app __x16__ = (WrapCompletion A)
          return __x16__
        } else {}
        app __x17__ = (IteratorValue next)
        if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
        let nextValue = __x17__
        if (= mapping true) {
          app __x18__ = (Call mapfn thisArg (new [nextValue, k]))
          let mappedValue = __x18__
          app __x19__ = (IsAbruptCompletion mappedValue)
          if __x19__ {
            app __x20__ = (IteratorClose iteratorRecord mappedValue)
            if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
            app __x21__ = (WrapCompletion __x20__)
            return __x21__
          } else {}
        } else let mappedValue = nextValue
        app __x22__ = (CreateDataPropertyOrThrow A Pk mappedValue)
        let defineStatus = __x22__
        app __x23__ = (IsAbruptCompletion defineStatus)
        if __x23__ {
          app __x24__ = (IteratorClose iteratorRecord defineStatus)
          if (is-completion __x24__) if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
          app __x25__ = (WrapCompletion __x24__)
          return __x25__
        } else {}
        k = (+ k 1i)
      }
    } else {}
    app __x26__ = (ToObject items)
    if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let arrayLike = __x26__
    app __x27__ = (LengthOfArrayLike arrayLike)
    if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
    let len = __x27__
    app __x28__ = (IsConstructor C)
    if (= __x28__ true) {
      app __x29__ = (Construct C (new [len]))
      if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      let A = __x29__
    } else {
      app __x30__ = (ArrayCreate len)
      if (is-completion __x30__) if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
      let A = __x30__
    }
    let k = 0i
    while (< k len) {
      app __x31__ = (ToString k)
      if (is-completion __x31__) if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
      let Pk = __x31__
      app __x32__ = (Get arrayLike Pk)
      if (is-completion __x32__) if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
      let kValue = __x32__
      if (= mapping true) {
        app __x33__ = (Call mapfn thisArg (new [kValue, k]))
        if (is-completion __x33__) if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
        let mappedValue = __x33__
      } else let mappedValue = kValue
      app __x34__ = (CreateDataPropertyOrThrow A Pk mappedValue)
      if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
      __x34__
      k = (+ k 1i)
    }
    app __x35__ = (Set A "length" len true)
    if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
    __x35__
    app __x36__ = (WrapCompletion A)
    return __x36__
  }"""), this)
}
