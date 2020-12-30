package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object Script0VarScopedDeclarations0 extends Algorithm {
  val name: String = "Script0VarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Script0VarScopedDeclarations0" () => return (new [])"""), this)
}
