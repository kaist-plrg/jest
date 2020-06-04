package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration1BindingClassDeclarationEvaluation0 extends Algorithm {
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = parseFunc(""""ClassDeclaration1BindingClassDeclarationEvaluation0" (this, ClassTail) => {
    access __x0__ = (ClassTail "ClassDefinitionEvaluation")
    app __x1__ = (__x0__ undefined "default")
    let value = __x1__
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
    value
    value["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion value)
    return __x2__
  }""")
}
