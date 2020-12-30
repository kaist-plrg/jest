package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassDeclaration1BoundNames0 extends Algorithm {
  val name: String = "ClassDeclaration1BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassDeclaration1BoundNames0" (this, ClassTail) => return (new ["*default*"])"""), this)
}
