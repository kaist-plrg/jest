package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AsyncFunctionDeclaration1Contains0 extends Algorithm {
  val name: String = "AsyncFunctionDeclaration1Contains0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionDeclaration1Contains0" (this, FormalParameters, AsyncFunctionBody, symbol) => return false"""), this)
}
