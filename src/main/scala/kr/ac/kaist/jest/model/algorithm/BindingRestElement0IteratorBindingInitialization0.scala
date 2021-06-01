package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingRestElement0IteratorBindingInitialization0 extends Algorithm {
  val name: String = "BindingRestElement0IteratorBindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingRestElement0IteratorBindingInitialization0" (this, BindingIdentifier, iteratorRecord, environment) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__ environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (ArrayCreate 0i)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let A = __x2__
    let n = 0i
    while true {
      if (= iteratorRecord["Done"] false) {
        app __x3__ = (IteratorStep iteratorRecord)
        let next = __x3__
        app __x4__ = (IsAbruptCompletion next)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
        next
        if (= next false) iteratorRecord["Done"] = true else {}
      } else {}
      if (= iteratorRecord["Done"] true) {
        if (= environment undefined) {
          app __x5__ = (PutValue lhs A)
          if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          app __x6__ = (WrapCompletion __x5__)
          return __x6__
        } else {}
        app __x7__ = (InitializeReferencedBinding lhs A)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
      app __x9__ = (IteratorValue next)
      let nextValue = __x9__
      app __x10__ = (IsAbruptCompletion nextValue)
      if __x10__ iteratorRecord["Done"] = true else {}
      if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x11__ = (ToString n)
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (CreateDataPropertyOrThrow A __x11__ nextValue)
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      __x12__
      n = (+ n 1i)
    }
  }"""), this)
}
