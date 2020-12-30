package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NewPromiseReactionJob extends Algorithm {
  val name: String = "NewPromiseReactionJob"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewPromiseReactionJob" (reaction, argument) => {
    let job = (new Job ("Closure" -> PromiseReactionJob, "Captured" -> (new [reaction, argument])))
    let handlerRealm = null
    if (! (= reaction["Handler"] undefined)) {
      app __x0__ = (GetFunctionRealm reaction["Handler"])
      let getHandlerRealmResult = __x0__
      if (&& (is-completion getHandlerRealmResult) (= getHandlerRealmResult["Type"] CONST_normal)) handlerRealm = getHandlerRealmResult["Value"] else {}
    } else {}
    app __x1__ = (WrapCompletion (new Record("Job" -> job, "Realm" -> handlerRealm)))
    return __x1__
  }"""), this)
}
