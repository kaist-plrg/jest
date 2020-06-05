package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAbruptCompletion extends Algorithm {
  val name: String = "IsAbruptCompletion"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""IsAbruptCompletion" (x) => {
  return (&& (is-completion x) (! (= x.Type CONST_normal)))
  }"""), this)
}
