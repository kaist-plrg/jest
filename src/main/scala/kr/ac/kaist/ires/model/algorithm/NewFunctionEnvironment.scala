package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewFunctionEnvironment {
  val length: Int = 2
  val func: Func = parseFunc(""""NewFunctionEnvironment" (F, newTarget) => {
    app __x0__ = (Type newTarget)
    assert (|| (= __x0__ Undefined) (= __x0__ Object))
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new FunctionEnvironmentRecord("SubMap" -> (new SubMap())))
    envRec["FunctionObject"] = F
    if (= F["ThisMode"] CONST_lexical) envRec["ThisBindingStatus"] = "lexical" else envRec["ThisBindingStatus"] = "uninitialized"
    let home = F["HomeObject"]
    envRec["HomeObject"] = home
    envRec["NewTarget"] = newTarget
    env["EnvironmentRecord"] = envRec
    env["Outer"] = F["Environment"]
    app __x1__ = (WrapCompletion env)
    return __x1__
  }""")
}