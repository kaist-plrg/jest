package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NewPromiseResolveThenableJob extends Algorithm {
  val name: String = "NewPromiseResolveThenableJob"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewPromiseResolveThenableJob" (promiseToResolve, thenable, then) => {
    let job = (new Job ("Closure" -> PromiseResolveThenableJob, "Captured" -> (new [promiseToResolve, thenable, then])))
    app __x0__ = (GetFunctionRealm then)
    let getThenRealmResult = __x0__
    if (&& (is-completion getThenRealmResult) (= getThenRealmResult["Type"] CONST_normal)) let thenRealm = getThenRealmResult["Value"] else let thenRealm = null
    app __x1__ = (WrapCompletion (new Record("Job" -> job, "Realm" -> thenRealm)))
    return __x1__
  }"""), this)
}
