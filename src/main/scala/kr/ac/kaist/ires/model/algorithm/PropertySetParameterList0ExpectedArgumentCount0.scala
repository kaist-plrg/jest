package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertySetParameterList0ExpectedArgumentCount0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""PropertySetParameterList0ExpectedArgumentCount0" (this, FormalParameter) => {
    access __x0__ = (FormalParameter "HasInitializer")
    if (= __x0__ true) return 0i else {}
    return 1i
  }""")
}
