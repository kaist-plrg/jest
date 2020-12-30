package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Statement2VarDeclaredNames0 extends Algorithm {
  val name: String = "Statement2VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement2VarDeclaredNames0" (this, EmptyStatement) => return (new [])"""), this)
}
