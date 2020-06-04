package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SetRealmGlobalObject extends Algorithm {
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = parseFunc(""""SetRealmGlobalObject" (realmRec, globalObj, thisValue) => {
    if (= globalObj undefined) {
      let intrinsics = realmRec["Intrinsics"]
      app __x0__ = (ObjectCreate intrinsics["INTRINSIC_ObjectPrototype"])
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
  }""")
}
