package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GetSuperConstructor extends Algorithm {
  val name: String = "GetSuperConstructor"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GetSuperConstructor" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    assert (= (typeof envRec) "FunctionEnvironmentRecord")
    let activeFunction = envRec["FunctionObject"]
    app __x1__ = (activeFunction["GetPrototypeOf"] activeFunction)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let superConstructor = __x1__
    app __x2__ = (WrapCompletion superConstructor)
    return __x2__
  }"""), this)
}
