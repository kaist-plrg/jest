package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassElementList0ConstructorMethod0 extends Algorithm {
  val name: String = "ClassElementList0ConstructorMethod0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassElementList0ConstructorMethod0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x0__ = (ClassElement "IsStatic")
    if (= __x0__ true) return CONST_empty else {}
    access __x1__ = (ClassElement "PropName")
    if (! (= __x1__ "constructor")) return CONST_empty else {}
    return ClassElement
  }"""), this)
}
