package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object StatementListItem0LexicallyScopedDeclarations0 extends Algorithm {
  val name: String = "StatementListItem0LexicallyScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem0LexicallyScopedDeclarations0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (LabelledStatement "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }"""), this)
}
