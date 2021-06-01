package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryCallBindThis extends Algorithm {
  val name: String = "OrdinaryCallBindThis"
  val length: Int = 3
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryCallBindThis" (F, calleeContext, thisArgument) => {
    let thisMode = F["ThisMode"]
    if (= thisMode CONST_lexical) {
      app __x0__ = (NormalCompletion undefined)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let calleeRealm = F["Realm"]
    access __x2__ = (calleeContext "LexicalEnvironment")
    let localEnv = __x2__
    if (= thisMode CONST_strict) let thisValue = thisArgument else if (|| (= thisArgument undefined) (= thisArgument null)) {
      let globalEnv = calleeRealm["GlobalEnv"]
      let globalEnvRec = globalEnv["EnvironmentRecord"]
      assert (= (typeof globalEnvRec) "GlobalEnvironmentRecord")
      let thisValue = globalEnvRec["GlobalThisValue"]
    } else {
      app __x3__ = (ToObject thisArgument)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let thisValue = __x3__
    }
    let envRec = localEnv["EnvironmentRecord"]
    assert (= (typeof envRec) "FunctionEnvironmentRecord")
    app __x4__ = (envRec["BindThisValue"] envRec thisValue)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }"""), this)
}
