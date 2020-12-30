package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionEnvironmentRecordDOTBindThisValue extends Algorithm {
  val name: String = "FunctionEnvironmentRecordDOTBindThisValue"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionEnvironmentRecord.BindThisValue" (this, V) => {
    let envRec = this
    assert (! (= envRec["ThisBindingStatus"] CONST_lexical))
    if (= envRec["ThisBindingStatus"] CONST_initialized) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    envRec["ThisValue"] = V
    envRec["ThisBindingStatus"] = CONST_initialized
    app __x1__ = (WrapCompletion V)
    return __x1__
  }"""), this)
}
