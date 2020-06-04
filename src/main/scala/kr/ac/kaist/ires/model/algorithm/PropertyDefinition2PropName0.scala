package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition2PropName0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""PropertyDefinition2PropName0" (this, PropertyName, AssignmentExpression) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }""")
}
