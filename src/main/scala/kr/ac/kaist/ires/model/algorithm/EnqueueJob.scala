package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EnqueueJob {
  val length: Int = 3
  val func: Func = Func("""EnqueueJob""", List(Id("""queueName"""), Id("""job"""), Id("""arguments""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))), ILet(Id("""callerRealm"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""Realm""")))), ILet(Id("""callerScriptOrModule"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""ScriptOrModule""")))), ILet(Id("""pending"""), EMap(Ty("""PendingJob"""), List((EStr("""Job"""), ERef(RefId(Id("""job""")))), (EStr("""Arguments"""), ERef(RefId(Id("""arguments""")))), (EStr("""Realm"""), ERef(RefId(Id("""callerRealm""")))), (EStr("""ScriptOrModule"""), ERef(RefId(Id("""callerScriptOrModule""")))), (EStr("""HostDefined"""), EUndef)))), IAppend(ERef(RefId(Id("""pending"""))), ERef(RefId(Id("""GLOBAL_jobQueue""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "EnqueueJob" (queueName, job, arguments) => {
    let callerContext = GLOBAL_context
    let callerRealm = callerContext["Realm"]
    let callerScriptOrModule = callerContext["ScriptOrModule"]
    let pending = (new PendingJob("Job" -> job, "Arguments" -> arguments, "Realm" -> callerRealm, "ScriptOrModule" -> callerScriptOrModule, "HostDefined" -> undefined))
    append pending -> GLOBAL_jobQueue
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
