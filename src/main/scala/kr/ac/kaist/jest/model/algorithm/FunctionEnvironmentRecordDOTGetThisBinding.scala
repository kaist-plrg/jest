package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionEnvironmentRecordDOTGetThisBinding extends Algorithm {
  val name: String = "FunctionEnvironmentRecordDOTGetThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionEnvironmentRecord.GetThisBinding" (this) => {
    let envRec = this
    assert (! (= envRec["ThisBindingStatus"] CONST_lexical))
    if (= envRec["ThisBindingStatus"] CONST_uninitialized) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["ThisValue"])
    return __x1__
  }"""), this)
}
