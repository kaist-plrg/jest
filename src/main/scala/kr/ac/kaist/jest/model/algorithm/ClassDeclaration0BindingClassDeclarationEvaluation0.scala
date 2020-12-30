package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ClassDeclaration0BindingClassDeclarationEvaluation0 extends Algorithm {
  val name: String = "ClassDeclaration0BindingClassDeclarationEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassDeclaration0BindingClassDeclarationEvaluation0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let className = __x0__
    access __x1__ = (ClassTail "ClassDefinitionEvaluation")
    app __x2__ = (__x1__ className className)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    value["SourceText"] = (get-syntax this)
    let env = GLOBAL_context["LexicalEnvironment"]
    app __x3__ = (InitializeBoundName className value env)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion value)
    return __x4__
  }"""), this)
}
