package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTINTRINSIC_MapIteratorPrototypeDOTnext extends Algorithm {
  val name: String = "GLOBALDOTINTRINSIC_MapIteratorPrototypeDOTnext"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.INTRINSIC_MapIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (|| (|| (= O.IteratedMap absent) (= O.MapNextIndex absent)) (= O.MapIterationKind absent)) throw TypeError else {}
    let m = O["IteratedMap"]
    let index = O["MapNextIndex"]
    let itemKind = O["MapIterationKind"]
    if (= m undefined) {
      app __x2__ = (CreateIterResultObject undefined true)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    assert (! (= m["MapData"] absent))
    let entries = m["MapData"]
    let numEntries = entries["length"]
    while (< index numEntries) {
      let e = entries[index]
      index = (+ index 1i)
      O["MapNextIndex"] = index
      if (! (= e["Key"] CONST_empty)) {
        if (= itemKind CONST_key) let result = e["Key"] else if (= itemKind CONST_value) let result = e["Value"] else {
          assert (= itemKind CONST_keyPLUSvalue)
          app __x4__ = (CreateArrayFromList (new [e["Key"], e["Value"]]))
          if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
          let result = __x4__
        }
        app __x5__ = (CreateIterResultObject result false)
        app __x6__ = (WrapCompletion __x5__)
        return __x6__
      } else {}
    }
    O["IteratedMap"] = undefined
    app __x7__ = (CreateIterResultObject undefined true)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }"""), this)
}
