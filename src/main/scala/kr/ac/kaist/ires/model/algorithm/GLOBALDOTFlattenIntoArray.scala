package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFlattenIntoArray {
  val length: Int = 5
  val func: Func = parseFunc(""""GLOBAL.FlattenIntoArray" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let source = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let sourceLen = __x2__
    app __x3__ = (GetArgument argumentsList 3i)
    let start = __x3__
    app __x4__ = (GetArgument argumentsList 4i)
    let depth = __x4__
    app __x5__ = (GetArgument argumentsList 5i)
    let mapperFunction = __x5__
    app __x6__ = (GetArgument argumentsList 6i)
    let thisArg = __x6__
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x7__ = (ToString sourceIndex)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let P = __x7__
      app __x8__ = (HasProperty source P)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let exists = __x8__
      if (= exists true) {
        app __x9__ = (Get source P)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let element = __x9__
        if (! (= mapperFunction absent)) {
          assert (! (= thisArg absent))
          app __x10__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          element = __x10__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x11__ = (IsArray element)
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          shouldFlatten = __x11__
        } else {}
        if (= shouldFlatten true) {
          app __x12__ = (Get element "length")
          if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          app __x13__ = (ToLength __x12__)
          if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          let elementLen = __x13__
          app __x14__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
          targetIndex = __x14__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x15__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x15__
          } else {}
          app __x16__ = (ToString targetIndex)
          if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
          app __x17__ = (CreateDataPropertyOrThrow target __x16__ element)
          if (is-completion __x17__) if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
          __x17__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x18__ = (WrapCompletion targetIndex)
    return __x18__
  }""")
}
