package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_StringIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.INTRINSIC_StringIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= O["IteratedString"] absent) (= O["StringIteratorNextIndex"] absent)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let s = O["IteratedString"]
    if (= s undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let position = O["StringIteratorNextIndex"]
    let len = s["length"]
    if (! (< position len)) {
      O["IteratedString"] = undefined
      app __x5__ = (CreateIterResultObject undefined true)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    let first = !!! "StringOp"
    if (|| (< first 55296i) (|| (< 56319i first) (== (+ position 1i) len))) let resultString = first else {
      let second = !!! "StringOp"
      if (|| (< second 56320i) (< 57343i second)) let resultString = first else let resultString = (+ first second)
    }
    let resultSize = resultString["length"]
    O["StringIteratorNextIndex"] = (+ position resultSize)
    app __x7__ = (CreateIterResultObject resultString false)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
