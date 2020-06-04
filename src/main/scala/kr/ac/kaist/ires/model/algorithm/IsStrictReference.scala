package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsStrictReference extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IsStrictReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (WrapCompletion V["StrictReference"])
    return __x1__
  }""")
}
