package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_ArrayIteratorPrototypeDOTnext extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_ArrayIteratorPrototypeDOTnext"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_ArrayIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= absent O["IteratedArrayLike"]) (|| (= absent O["ArrayLikeNextIndex"]) (= absent O["ArrayLikeIterationKind"]))) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let a = O["IteratedArrayLike"]
    if (= a undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let index = O["ArrayLikeNextIndex"]
    let itemKind = O["ArrayLikeIterationKind"]
    if (! (= a["TypedArrayName"] absent)) {
      app __x5__ = (IsDetachedBuffer a["ViewedArrayBuffer"])
      if (= __x5__ true) {
        app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x6__
      } else {}
      let len = a["ArrayLength"]
    } else {
      app __x7__ = (LengthOfArrayLike a)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let len = __x7__
    }
    if (! (< index len)) {
      O["IteratedArrayLike"] = undefined
      app __x8__ = (CreateIterResultObject undefined true)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    O["ArrayLikeNextIndex"] = (+ index 1i)
    if (= itemKind CONST_key) {
      app __x10__ = (CreateIterResultObject index false)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (ToString index)
    if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let elementKey = __x12__
    app __x13__ = (Get a elementKey)
    if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let elementValue = __x13__
    if (= itemKind CONST_value) let result = elementValue else {
      assert (= itemKind CONST_keyPLUSvalue)
      app __x14__ = (CreateArrayFromList (new [index, elementValue]))
      if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let result = __x14__
    }
    app __x15__ = (CreateIterResultObject result false)
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }"""), this)
}
