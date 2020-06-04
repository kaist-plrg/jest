package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1ExpectedArgumentCount0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""FormalParameterList1ExpectedArgumentCount0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    let count = __x0__
    access __x1__ = (FormalParameterList "HasInitializer")
    let __x2__ = (= __x1__ true)
    if __x2__ {} else {
      access __x3__ = (FormalParameter "HasInitializer")
      __x2__ = (= __x3__ true)
    }
    if __x2__ return count else {}
    return (+ count 1i)
  }""")
}
