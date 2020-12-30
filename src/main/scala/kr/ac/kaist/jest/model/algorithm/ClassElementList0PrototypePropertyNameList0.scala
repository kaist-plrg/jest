package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassElementList0PrototypePropertyNameList0 extends Algorithm {
  val name: String = "ClassElementList0PrototypePropertyNameList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassElementList0PrototypePropertyNameList0" (this, ClassElement) => {
    access __x0__ = (ClassElement "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return (new []) else {}
    access __x2__ = (ClassElement "PropName")
    return (new [__x2__])
  }"""), this)
}
