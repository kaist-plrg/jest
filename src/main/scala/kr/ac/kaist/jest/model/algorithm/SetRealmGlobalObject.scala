package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object SetRealmGlobalObject extends Algorithm {
  val name: String = "SetRealmGlobalObject"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SetRealmGlobalObject" (realmRec, globalObj, thisValue) => {
    if (= globalObj undefined) {
      let intrinsics = realmRec["Intrinsics"]
      app __x0__ = (OrdinaryObjectCreate intrinsics["INTRINSIC_ObjectPrototype"])
      globalObj = __x0__
    } else {}
    app __x1__ = (Type globalObj)
    assert (= __x1__ Object)
    if (= thisValue undefined) thisValue = globalObj else {}
    realmRec["GlobalObject"] = globalObj
    app __x2__ = (NewGlobalEnvironment globalObj thisValue)
    let newGlobalEnv = __x2__
    realmRec["GlobalEnv"] = newGlobalEnv
    app __x3__ = (WrapCompletion realmRec)
    return __x3__
  }"""), this)
}
