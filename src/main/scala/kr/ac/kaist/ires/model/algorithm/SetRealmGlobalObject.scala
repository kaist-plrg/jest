package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetRealmGlobalObject extends Algorithm {
  val name: String = "SetRealmGlobalObject"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SetRealmGlobalObject" (realmRec, globalObj, thisValue) => {
    if (= globalObj undefined) {
      let intrinsics = realmRec["Intrinsics"]
      !!! "Set id:{globalObj} to OrdinaryObjectCreate ( id:{intrinsics} . [ [ % Object . prototype % ] ] ) ."
    } else {}
    app __x0__ = (Type globalObj)
    assert (= __x0__ Object)
    if (= thisValue undefined) thisValue = globalObj else {}
    realmRec["GlobalObject"] = globalObj
    app __x1__ = (NewGlobalEnvironment globalObj thisValue)
    let newGlobalEnv = __x1__
    realmRec["GlobalEnv"] = newGlobalEnv
    app __x2__ = (WrapCompletion realmRec)
    return __x2__
  }"""), this)
}
