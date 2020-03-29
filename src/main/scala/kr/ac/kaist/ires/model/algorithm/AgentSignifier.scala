package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AgentSignifier {
  val length: Int = 0
  val func: Func = parseFunc(""""AgentSignifier" () => {
    !!! "Etc"
    app __x0__ = (WrapCompletion AR["Signifier"])
    return __x0__
  }""")
}
