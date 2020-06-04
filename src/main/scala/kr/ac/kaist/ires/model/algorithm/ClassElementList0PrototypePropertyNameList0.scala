package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0PrototypePropertyNameList0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ClassElementList0PrototypePropertyNameList0" (this, ClassElement) => {
    access __x0__ = (ClassElement "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return (new []) else {}
    access __x2__ = (ClassElement "PropName")
    return (new [__x2__])
  }""")
}
