package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HostHasSourceTextAvailable extends Algorithm {
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = parseFunc(""""HostHasSourceTextAvailable" (func) => {
    return (new Completion("Type" -> CONST_normal, "Value" -> true, "Target" -> CONST_empty))
  }""")
}
