package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0LexicallyDeclaredNames0 extends Algorithm {
  val name: String = "LabelledStatement0LexicallyDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledStatement0LexicallyDeclaredNames0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "LexicallyDeclaredNames")
    return __x0__
  }"""), this)
}
