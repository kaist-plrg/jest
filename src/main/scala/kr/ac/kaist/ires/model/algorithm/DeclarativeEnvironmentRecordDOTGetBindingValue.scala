package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTGetBindingValue extends Algorithm {
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = parseFunc(""""DeclarativeEnvironmentRecord.GetBindingValue" (this, N, S) => {
    let envRec = this
    if (= envRec["SubMap"][N]["initialized"] false) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["SubMap"][N]["BoundValue"])
    return __x1__
  }""")
}
