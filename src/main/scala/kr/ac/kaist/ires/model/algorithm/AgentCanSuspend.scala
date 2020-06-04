package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentCanSuspend extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""AgentCanSuspend" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["CanBlock"])
    return __x0__
  }""")
}
