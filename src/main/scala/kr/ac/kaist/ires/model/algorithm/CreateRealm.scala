package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.Algorithm
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateRealm extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""CreateRealm" () => {
    let realmRec = REALM
    app __x0__ = (CreateIntrinsics realmRec)
    __x0__
    realmRec["GlobalObject"] = undefined
    realmRec["GlobalEnv"] = undefined
    realmRec["TemplateMap"] = (new [])
    app __x1__ = (WrapCompletion realmRec)
    return __x1__
  }""")
}
