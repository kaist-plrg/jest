package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object RunJobs extends Algorithm {
  val name: String = "RunJobs"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""RunJobs" () => {
    app __x0__ = (InitializeHostDefinedRealm )
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (EnqueueJob "ScriptJobs" ScriptEvaluationJob (new [script, hostDefined]))
    while true {
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] GLOBAL_context) {
        __x2__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x2__)
        if (= GLOBAL_executionStack["length"] 0i) GLOBAL_context = null else GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      } else GLOBAL_context = null
      if (= GLOBAL_jobQueue["length"] 0.0) return (new Completion("Type" -> CONST_normal, "Value" -> undefined, "Target" -> CONST_empty)) else {}
      let nextQueue = GLOBAL_jobQueue
      let nextPending = (pop nextQueue 0i)
      let newContext = (new ExecutionContext("SubMap" -> (new SubMap())))
      newContext["Function"] = null
      newContext["Realm"] = nextPending["Realm"]
      newContext["ScriptOrModule"] = nextPending["ScriptOrModule"]
      append newContext -> GLOBAL_executionStack
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      app __x3__ = (nextPending["Job"] nextPending["Arguments"][0i] nextPending["Arguments"][1i] nextPending["Arguments"][2i])
      let result = __x3__
      app __x4__ = (IsAbruptCompletion result)
      if __x4__ return result else {}
    }
  }"""), this)
}
