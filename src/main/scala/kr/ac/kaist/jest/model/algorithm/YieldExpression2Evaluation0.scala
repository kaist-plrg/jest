package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object YieldExpression2Evaluation0 extends Algorithm {
  val name: String = "YieldExpression2Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""YieldExpression2Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetGeneratorKind )
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    app __x3__ = (GetIterator value generatorKind)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let iteratorRecord = __x3__
    let iterator = iteratorRecord["Iterator"]
    app __x4__ = (NormalCompletion undefined)
    let received = __x4__
    while true if (= received["Type"] CONST_normal) {
      app __x5__ = (Call iteratorRecord["NextMethod"] iteratorRecord["Iterator"] (new [received["Value"]]))
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let innerResult = __x5__
      if (= generatorKind CONST_async) {
        app __x6__ = (Await innerResult)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        innerResult = __x6__
      } else {}
      app __x7__ = (Type innerResult)
      if (! (= __x7__ Object)) {
        app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x8__
      } else {}
      app __x9__ = (IteratorComplete innerResult)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let done = __x9__
      if (= done true) {
        app __x10__ = (IteratorValue innerResult)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        app __x11__ = (WrapCompletion __x10__)
        return __x11__
      } else {}
      if (= generatorKind CONST_async) {
        app __x12__ = (IteratorValue innerResult)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (AsyncGeneratorYield __x12__)
        received = __x13__
      } else {
        app __x14__ = (GeneratorYield innerResult)
        received = __x14__
      }
    } else if (= received["Type"] CONST_throw) {
      app __x15__ = (GetMethod iterator "throw")
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      let throw = __x15__
      if (! (= throw undefined)) {
        app __x16__ = (Call throw iterator (new [received["Value"]]))
        if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        let innerResult = __x16__
        if (= generatorKind CONST_async) {
          app __x17__ = (Await innerResult)
          if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
          innerResult = __x17__
        } else {}
        app __x18__ = (Type innerResult)
        if (! (= __x18__ Object)) {
          app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x19__
        } else {}
        app __x20__ = (IteratorComplete innerResult)
        if (is-completion __x20__) if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let done = __x20__
        if (= done true) {
          app __x21__ = (IteratorValue innerResult)
          if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
          app __x22__ = (WrapCompletion __x21__)
          return __x22__
        } else {}
        if (= generatorKind CONST_async) {
          app __x23__ = (IteratorValue innerResult)
          if (is-completion __x23__) if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          app __x24__ = (AsyncGeneratorYield __x23__)
          received = __x24__
        } else {
          app __x25__ = (GeneratorYield innerResult)
          received = __x25__
        }
      } else {
        let closeCompletion = (new Completion("Type" -> CONST_normal, "Value" -> CONST_empty, "Target" -> CONST_empty))
        if (= generatorKind CONST_async) {
          app __x26__ = (AsyncIteratorClose iteratorRecord closeCompletion)
          if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
          __x26__
        } else {
          app __x27__ = (IteratorClose iteratorRecord closeCompletion)
          if (is-completion __x27__) if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
          __x27__
        }
        app __x28__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x28__
      }
    } else {
      assert (= received["Type"] CONST_return)
      app __x29__ = (GetMethod iterator "return")
      if (is-completion __x29__) if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      let return = __x29__
      if (= return undefined) {
        if (= generatorKind CONST_async) {
          app __x30__ = (Await received["Value"])
          if (is-completion __x30__) if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          received["Value"] = __x30__
        } else {}
        app __x31__ = (Completion received)
        app __x32__ = (WrapCompletion __x31__)
        return __x32__
      } else {}
      app __x33__ = (Call return iterator (new [received["Value"]]))
      if (is-completion __x33__) if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      let innerReturnResult = __x33__
      if (= generatorKind CONST_async) {
        app __x34__ = (Await innerReturnResult)
        if (is-completion __x34__) if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
        innerReturnResult = __x34__
      } else {}
      app __x35__ = (Type innerReturnResult)
      if (! (= __x35__ Object)) {
        app __x36__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x36__
      } else {}
      app __x37__ = (IteratorComplete innerReturnResult)
      if (is-completion __x37__) if (= __x37__["Type"] CONST_normal) __x37__ = __x37__["Value"] else return __x37__ else {}
      let done = __x37__
      if (= done true) {
        app __x38__ = (IteratorValue innerReturnResult)
        if (is-completion __x38__) if (= __x38__["Type"] CONST_normal) __x38__ = __x38__["Value"] else return __x38__ else {}
        let value = __x38__
        app __x39__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> value, "Target" -> CONST_empty)))
        return __x39__
      } else {}
      if (= generatorKind CONST_async) {
        app __x40__ = (IteratorValue innerReturnResult)
        if (is-completion __x40__) if (= __x40__["Type"] CONST_normal) __x40__ = __x40__["Value"] else return __x40__ else {}
        app __x41__ = (AsyncGeneratorYield __x40__)
        received = __x41__
      } else {
        app __x42__ = (GeneratorYield innerReturnResult)
        received = __x42__
      }
    }
  }"""), this)
}
