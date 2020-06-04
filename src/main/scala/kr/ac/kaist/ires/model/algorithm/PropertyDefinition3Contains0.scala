package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition3Contains0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""PropertyDefinition3Contains0" (this, MethodDefinition, symbol) => {
    if (is-instance-of symbol MethodDefinition) return true else {}
    access __x0__ = (MethodDefinition "ComputedPropertyContains")
    app __x1__ = (__x0__ symbol)
    return __x1__
  }""")
}
