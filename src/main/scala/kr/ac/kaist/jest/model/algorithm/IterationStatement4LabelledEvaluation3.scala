package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement4LabelledEvaluation3 extends Algorithm {
  val name: String = "IterationStatement4LabelledEvaluation3"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement4LabelledEvaluation3" (this, LexicalDeclaration, Expression0, Expression1, Statement, labelSet) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let loopEnv = __x0__
    let loopEnvRec = loopEnv["EnvironmentRecord"]
    access __x1__ = (LexicalDeclaration "IsConstantDeclaration")
    let isConst = __x1__
    access __x2__ = (LexicalDeclaration "BoundNames")
    let boundNames = __x2__
    let __x3__ = boundNames
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let dn = __x3__[__x4__]
      if (= isConst true) {
        app __x5__ = (loopEnvRec["CreateImmutableBinding"] loopEnvRec dn true)
        if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      } else {
        app __x6__ = (loopEnvRec["CreateMutableBinding"] loopEnvRec dn false)
        if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
      }
      __x4__ = (+ __x4__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = loopEnv
    access __x7__ = (LexicalDeclaration "Evaluation")
    let forDcl = __x7__
    app __x8__ = (IsAbruptCompletion forDcl)
    if __x8__ {
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x9__ = (Completion forDcl)
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    if (= isConst false) let perIterationLets = boundNames else let perIterationLets = (new [])
    app __x11__ = (ForBodyEvaluation Expression0 Expression1 Statement perIterationLets labelSet)
    let bodyResult = __x11__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x12__ = (Completion bodyResult)
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }"""), this)
}
