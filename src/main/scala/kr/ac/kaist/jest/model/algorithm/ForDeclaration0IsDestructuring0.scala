package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ForDeclaration0IsDestructuring0 extends Algorithm {
  val name: String = "ForDeclaration0IsDestructuring0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForDeclaration0IsDestructuring0" (this, LetOrConst, ForBinding) => {
    access __x0__ = (ForBinding "IsDestructuring")
    return __x0__
  }"""), this)
}
