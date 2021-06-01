package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FlattenIntoArray extends Algorithm {
  val name: String = "FlattenIntoArray"
  val length: Int = 5
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FlattenIntoArray" (target, source, sourceLen, start, depth, mapperFunction, thisArg) => {
    app __x0__ = (Type target)
    assert (= __x0__ Object)
    app __x1__ = (Type source)
    assert (= __x1__ Object)
    app __x2__ = (IsNonNegativeInteger sourceLen)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    assert (= __x2__ true)
    app __x3__ = (IsNonNegativeInteger start)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    assert (= __x3__ true)
    app __x4__ = (IsInteger depth)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    assert (|| (= __x4__ true) (|| (= depth Infinity) (= depth -Infinity)))
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x5__ = (ToString sourceIndex)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let P = __x5__
      app __x6__ = (HasProperty source P)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let exists = __x6__
      if (= exists true) {
        app __x7__ = (Get source P)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let element = __x7__
        if (! (= mapperFunction absent)) {
          app __x8__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          element = __x8__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x9__ = (IsArray element)
          if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          shouldFlatten = __x9__
        } else {}
        if (= shouldFlatten true) {
          app __x10__ = (LengthOfArrayLike element)
          if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          let elementLen = __x10__
          app __x11__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          targetIndex = __x11__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x12__
          } else {}
          app __x13__ = (ToString targetIndex)
          if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          app __x14__ = (CreateDataPropertyOrThrow target __x13__ element)
          if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
          __x14__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x15__ = (WrapCompletion targetIndex)
    return __x15__
  }"""), this)
}
