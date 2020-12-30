package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LabelledItem1TopLevelVarDeclaredNames0 extends Algorithm {
  val name: String = "LabelledItem1TopLevelVarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledItem1TopLevelVarDeclaredNames0" (this, FunctionDeclaration) => {
    access __x0__ = (FunctionDeclaration "BoundNames")
    return __x0__
  }"""), this)
}
