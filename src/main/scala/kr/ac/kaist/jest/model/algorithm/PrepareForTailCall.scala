package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PrepareForTailCall extends Algorithm {
  val name: String = "PrepareForTailCall"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PrepareForTailCall" () => {
    let leafContext = GLOBAL_context
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] leafContext) {
      __x0__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x0__)
      if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    } else GLOBAL_context = null
  }"""), this)
}
