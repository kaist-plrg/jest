package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentSignifier extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AgentSignifier" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["Signifier"])
    return __x0__
  }"""))
}
