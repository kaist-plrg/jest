package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Statement8VarDeclaredNames0 extends Algorithm {
  val name: String = "Statement8VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement8VarDeclaredNames0" (this, ReturnStatement) => return (new [])"""), this)
}
