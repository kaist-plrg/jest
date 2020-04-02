package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_ArrayIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.INTRINSIC_ArrayIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= absent O["IteratedObject"]) (|| (= absent O["ArrayIteratorNextIndex"]) (= absent O["ArrayIterationKind"]))) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let a = O["IteratedObject"]
    if (= a undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let index = O["ArrayIteratorNextIndex"]
    let itemKind = O["ArrayIterationKind"]
    if (! (= a["TypedArrayName"] absent)) {
      app __x5__ = (IsDetachedBuffer a["ViewedArrayBuffer"])
      if (= __x5__ true) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      let len = a["ArrayLength"]
    } else {
      app __x7__ = (Get a "length")
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (ToLength __x7__)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let len = __x8__
    }
    if (! (< index len)) {
      O["IteratedObject"] = undefined
      app __x9__ = (CreateIterResultObject undefined true)
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    O["ArrayIteratorNextIndex"] = (+ index 1i)
    if (= itemKind "key") {
      app __x11__ = (CreateIterResultObject index false)
      app __x12__ = (WrapCompletion __x11__)
      return __x12__
    } else {}
    app __x13__ = (ToString index)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let elementKey = __x13__
    app __x14__ = (Get a elementKey)
    if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
    let elementValue = __x14__
    if (= itemKind "value") let result = elementValue else {
      assert (= itemKind "key+value")
      app __x15__ = (CreateArrayFromList (new [index, elementValue]))
      let result = __x15__
    }
    app __x16__ = (CreateIterResultObject result false)
    app __x17__ = (WrapCompletion __x16__)
    return __x17__
  }""")
}
