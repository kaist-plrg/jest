package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HostPromiseRejectionTracker extends Algorithm {
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = parseFunc(""""HostPromiseRejectionTracker" (promise, operation) => {
    return (new Completion("Type" -> CONST_normal, "Value" -> undefined, "Target" -> CONST_empty))
  }""")
}
