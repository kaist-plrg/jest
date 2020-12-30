package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassElementList1PrototypePropertyNameList0 extends Algorithm {
  val name: String = "ClassElementList1PrototypePropertyNameList0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassElementList1PrototypePropertyNameList0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "PrototypePropertyNameList")
    let list = __x0__
    access __x1__ = (ClassElement "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (ClassElement "IsStatic")
    if (= __x2__ true) return list else {}
    access __x3__ = (ClassElement "PropName")
    append __x3__ -> list
    return list
  }"""), this)
}
