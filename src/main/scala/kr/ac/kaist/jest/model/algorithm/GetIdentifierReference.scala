package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetIdentifierReference extends Algorithm {
  val name: String = "GetIdentifierReference"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetIdentifierReference" (lex, name, strict) => {
    if (= lex null) {
      app __x0__ = (WrapCompletion (new Reference("BaseValue" -> undefined, "ReferencedName" -> name, "StrictReference" -> strict)))
      return __x0__
    } else {}
    let envRec = lex["EnvironmentRecord"]
    app __x1__ = (envRec["HasBinding"] envRec name)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let exists = __x1__
    if (= exists true) {
      app __x2__ = (WrapCompletion (new Reference("BaseValue" -> envRec, "ReferencedName" -> name, "StrictReference" -> strict)))
      return __x2__
    } else {
      let outer = lex["Outer"]
      app __x3__ = (GetIdentifierReference outer name strict)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    }
  }"""), this)
}
