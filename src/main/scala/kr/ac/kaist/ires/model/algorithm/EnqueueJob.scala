package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnqueueJob extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""EnqueueJob" (queueName, job, arguments) => {
    let callerContext = GLOBAL_context
    let callerRealm = callerContext["Realm"]
    let callerScriptOrModule = callerContext["ScriptOrModule"]
    let pending = (new PendingJob("Job" -> job, "Arguments" -> arguments, "Realm" -> callerRealm, "ScriptOrModule" -> callerScriptOrModule, "HostDefined" -> undefined))
    append pending -> GLOBAL_jobQueue
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
