package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionEnvironmentRecordDOTGetSuperBase extends Algorithm {
  val name: String = "FunctionEnvironmentRecordDOTGetSuperBase"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionEnvironmentRecord.GetSuperBase" (this) => {
    let envRec = this
    let home = envRec["HomeObject"]
    if (= home undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app __x1__ = (Type home)
    assert (= __x1__ Object)
    app __x2__ = (home["GetPrototypeOf"] home)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }"""), this)
}
