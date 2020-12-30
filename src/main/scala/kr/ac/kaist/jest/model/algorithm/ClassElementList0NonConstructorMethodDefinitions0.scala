package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassElementList0NonConstructorMethodDefinitions0 extends Algorithm {
  val name: String = "ClassElementList0NonConstructorMethodDefinitions0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassElementList0NonConstructorMethodDefinitions0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return (new []) else {}
    access __x0__ = (ClassElement "IsStatic")
    let __x1__ = (= __x0__ false)
    if __x1__ {
      access __x2__ = (ClassElement "PropName")
      __x1__ = (= __x2__ "constructor")
    } else {}
    if __x1__ return (new []) else {}
    return (new [ClassElement])
  }"""), this)
}
