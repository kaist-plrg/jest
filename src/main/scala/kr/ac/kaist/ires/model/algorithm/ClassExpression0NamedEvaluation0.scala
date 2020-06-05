package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0NamedEvaluation0 extends Algorithm {
  val name: String = "ClassExpression0NamedEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassExpression0NamedEvaluation0" (this, ClassTail, name) => {
    access __x0__ = (ClassTail "ClassDefinitionEvaluation")
    app __x1__ = (__x0__ undefined name)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
