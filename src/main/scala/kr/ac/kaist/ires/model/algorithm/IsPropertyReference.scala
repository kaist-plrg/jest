package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsPropertyReference extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = parseFunc(""""IsPropertyReference" (V) => {
    app __x0__ = (Type V)
    assert (= __x0__ Reference)
    app __x1__ = (Type V["BaseValue"])
    app __x2__ = (HasPrimitiveBase V)
    if (|| (= __x1__ "Object") (= __x2__ true)) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {
      app __x4__ = (WrapCompletion false)
      return __x4__
    }
  }""")
}
