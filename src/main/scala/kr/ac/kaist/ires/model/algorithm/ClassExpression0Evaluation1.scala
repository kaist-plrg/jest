package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0Evaluation1 extends Algorithm {
  val name: String = "ClassExpression0Evaluation1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassExpression0Evaluation1" (this, BindingIdentifier, ClassTail) => {
    if (= BindingIdentifier absent) let className = undefined else {
      access __x0__ = (BindingIdentifier "StringValue")
      let className = __x0__
    }
    access __x1__ = (ClassTail "ClassDefinitionEvaluation")
    app __x2__ = (__x1__ className className)
    let value = __x2__
    if (is-completion value) if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
    value
    value["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion value)
    return __x3__
  }"""), this)
}
