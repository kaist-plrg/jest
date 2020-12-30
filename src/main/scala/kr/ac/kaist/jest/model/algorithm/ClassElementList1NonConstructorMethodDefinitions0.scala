package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassElementList1NonConstructorMethodDefinitions0 extends Algorithm {
  val name: String = "ClassElementList1NonConstructorMethodDefinitions0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassElementList1NonConstructorMethodDefinitions0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "NonConstructorMethodDefinitions")
    let list = __x0__
    if (is-instance-of ClassElement ClassElement2) return list else {}
    access __x1__ = (ClassElement "IsStatic")
    let __x2__ = (= __x1__ false)
    if __x2__ {
      access __x3__ = (ClassElement "PropName")
      __x2__ = (= __x3__ "constructor")
    } else {}
    if __x2__ return list else {}
    append ClassElement -> list
    return list
  }"""), this)
}
