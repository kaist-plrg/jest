package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GeneratorDeclaration1BoundNames0 extends Algorithm {
  val name: String = "GeneratorDeclaration1BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorDeclaration1BoundNames0" (this, FormalParameters, GeneratorBody) => return (new ["*default*"])"""), this)
}
