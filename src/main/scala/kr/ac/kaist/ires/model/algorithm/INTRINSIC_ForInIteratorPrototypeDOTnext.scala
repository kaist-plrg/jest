package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object INTRINSIC_ForInIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = parseFunc(""""INTRINSIC_ForInIteratorPrototype.next" () => {
    let O = this
    app __x0__ = (Type O)
    assert (= __x0__ Object)
    let object = O["Object"]
    let visited = O["VisitedKeys"]
    let remaining = O["RemainingKeys"]
    while true {
      if (= O["ObjectWasVisited"] false) {
        app __x1__ = (object["OwnPropertyKeys"] object)
        if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let keys = __x1__
        let __x2__ = keys
        let __x3__ = 0i
        while (< __x3__ __x2__["length"]) {
          let key = __x2__[__x3__]
          app __x4__ = (Type key)
          if (= __x4__ String) append key -> remaining else {}
          __x3__ = (+ __x3__ 1i)
        }
        O["ObjectWasVisited"] = true
      } else {}
      while (< 0i remaining["length"]) {
        let r = (pop remaining 0i)
        !!! "If there does not exist an element id:{v} of id:{visited} such that SameValue ( id:{r} , id:{v} ) is value:{true} , then step-list:{...}"
      }
      app __x5__ = (object["GetPrototypeOf"] object)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      object = __x5__
      O["Object"] = object
      O["ObjectWasVisited"] = false
      if (= object null) {
        app __x6__ = (CreateIterResultObject undefined true)
        app __x7__ = (WrapCompletion __x6__)
        return __x7__
      } else {}
    }
  }""")
}
