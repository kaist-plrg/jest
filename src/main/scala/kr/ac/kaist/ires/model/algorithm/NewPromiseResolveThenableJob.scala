package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewPromiseResolveThenableJob extends Algorithm {
  val name: String = "NewPromiseResolveThenableJob"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewPromiseResolveThenableJob" (promiseToResolve, thenable, then) => {
    !!! "Let id:{job} be a new Job abstract closure with no parameters that captures id:{promiseToResolve} , id:{thenable} , and id:{then} and performs the following steps when called : step-list:{...}"
    app __x0__ = (GetFunctionRealm then)
    let getThenRealmResult = __x0__
    if (&& (is-completion getThenRealmResult) (= getThenRealmResult["Type"] CONST_normal)) let thenRealm = getThenRealmResult["Value"] else let thenRealm = null
    app __x1__ = (WrapCompletion (new Record("Job" -> job, "Realm" -> thenRealm)))
    return __x1__
  }"""), this)
}
