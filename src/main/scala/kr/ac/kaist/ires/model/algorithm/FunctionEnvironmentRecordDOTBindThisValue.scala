package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTBindThisValue extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""FunctionEnvironmentRecord.BindThisValue" (this, V) => {
    let envRec = this
    assert (! (= envRec["ThisBindingStatus"] "lexical"))
    if (= envRec["ThisBindingStatus"] "initialized") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    envRec["ThisValue"] = V
    envRec["ThisBindingStatus"] = "initialized"
    app __x1__ = (WrapCompletion V)
    return __x1__
  }""")
}
