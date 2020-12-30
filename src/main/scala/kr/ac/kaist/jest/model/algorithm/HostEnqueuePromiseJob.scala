package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object HostEnqueuePromiseJob extends Algorithm {
  val name: String = "HostEnqueuePromiseJob"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""HostEnqueuePromiseJob" (job, realm) => {
    let callerContext = GLOBAL_context
    let callerScriptOrModule = callerContext["ScriptOrModule"]
    let pending = (new PendingJob ("Job" -> job.Closure, "Arguments" -> job.Captured, "Realm" -> realm, "ScriptOrModule" -> callerScriptOrModule, "HostDefined" -> undefined))
    append pending -> GLOBAL_jobQueue
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)

    return __x1__
  }"""), this)
}
