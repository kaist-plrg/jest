package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IsAbruptCompletion extends Algorithm {
  val name: String = "IsAbruptCompletion"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""IsAbruptCompletion" (x) => {
  return (&& (is-completion x) (! (= x.Type CONST_normal)))
  }"""), this)
}
