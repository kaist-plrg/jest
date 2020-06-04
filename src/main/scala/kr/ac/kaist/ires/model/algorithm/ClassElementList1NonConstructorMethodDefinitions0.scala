package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList1NonConstructorMethodDefinitions0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ClassElementList1NonConstructorMethodDefinitions0" (this, ClassElementList, ClassElement) => {
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
  }""")
}
