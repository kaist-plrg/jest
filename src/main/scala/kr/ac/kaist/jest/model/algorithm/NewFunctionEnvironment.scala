package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object NewFunctionEnvironment extends Algorithm {
  val name: String = "NewFunctionEnvironment"
  val length: Int = 2
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewFunctionEnvironment" (F, newTarget) => {
    app __x0__ = (Type newTarget)
    assert (|| (= __x0__ Undefined) (= __x0__ Object))
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new FunctionEnvironmentRecord("SubMap" -> (new SubMap())))
    envRec["FunctionObject"] = F
    if (= F["ThisMode"] CONST_lexical) envRec["ThisBindingStatus"] = CONST_lexical else envRec["ThisBindingStatus"] = CONST_uninitialized
    let home = F["HomeObject"]
    envRec["HomeObject"] = home
    envRec["NewTarget"] = newTarget
    env["EnvironmentRecord"] = envRec
    env["Outer"] = F["Environment"]
    app __x1__ = (WrapCompletion env)
    return __x1__
  }"""), this)
}
