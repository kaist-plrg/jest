package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HostEnsureCanCompileStrings extends Algorithm {
  val name: String = "HostEnsureCanCompileStrings"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""HostEnsureCanCompileStrings" (callerRealm, calleRealm) => {
    return (new Completion("Type" -> CONST_normal, "Value" -> undefined, "Target" -> CONST_empty))
  }"""), this)
}
