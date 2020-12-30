package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_StringIteratorPrototypeDOTnext extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_StringIteratorPrototypeDOTnext"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_StringIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (= O["IteratedString"] absent) (= O["StringNextIndex"] absent)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    let s = O["IteratedString"]
    if (= s undefined) {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let position = O["StringNextIndex"]
    let len = s["length"]
    if (! (< position len)) {
      O["IteratedString"] = undefined
      app __x5__ = (CreateIterResultObject undefined true)
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    app __x7__ = (CodePointAt s position)
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let cp = __x7__
    let resultString = !!! "StringOp"
    O["StringNextIndex"] = (+ position cp["CodeUnitCount"])
    app __x8__ = (CreateIterResultObject resultString false)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }"""), this)
}
