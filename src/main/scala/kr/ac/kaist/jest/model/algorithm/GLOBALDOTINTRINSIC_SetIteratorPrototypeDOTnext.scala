package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_SetIteratorPrototypeDOTnext extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_SetIteratorPrototypeDOTnext"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_SetIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (|| (= O.IteratedSet absent) (= O.SetNextIndex absent)) (= O.SetIterationKind absent)) throw TypeError else {}
    let s = O["IteratedSet"]
    let index = O["SetNextIndex"]
    let itemKind = O["SetIterationKind"]
    if (= s undefined) {
      app __x2__ = (CreateIterResultObject undefined true)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    assert (! (= s["SetData"] absent))
    let entries = s["SetData"]
    let numEntries = entries["length"]
    while (< index numEntries) {
      let e = entries[index]
      index = (+ index 1i)
      O["SetNextIndex"] = index
      if (! (= e CONST_empty)) {
        if (= itemKind CONST_keyPLUSvalue) {
          app __x4__ = (CreateArrayFromList (new [e, e]))
          app __x5__ = (CreateIterResultObject __x4__ false)
          app __x6__ = (WrapCompletion __x5__)
          return __x6__
        } else {}
        assert (= itemKind CONST_value)
        app __x7__ = (CreateIterResultObject e false)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
    }
    O["IteratedSet"] = undefined
    app __x9__ = (CreateIterResultObject undefined true)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }"""), this)
}
