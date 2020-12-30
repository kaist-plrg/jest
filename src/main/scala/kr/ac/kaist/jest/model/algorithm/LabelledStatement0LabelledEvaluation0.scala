package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LabelledStatement0LabelledEvaluation0 extends Algorithm {
  val name: String = "LabelledStatement0LabelledEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledStatement0LabelledEvaluation0" (this, LabelIdentifier, LabelledItem, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    append label -> labelSet
    access __x1__ = (LabelledItem "LabelledEvaluation")
    app __x2__ = (__x1__ labelSet)
    let stmtResult = __x2__
    let __x3__ = (= stmtResult["Type"] CONST_break)
    if __x3__ {
      app __x4__ = (SameValue stmtResult["Target"] label)
      __x3__ = (= __x4__ true)
    } else {}
    if __x3__ {
      app __x5__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x5__
    } else {}
    app __x6__ = (Completion stmtResult)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }"""), this)
}
