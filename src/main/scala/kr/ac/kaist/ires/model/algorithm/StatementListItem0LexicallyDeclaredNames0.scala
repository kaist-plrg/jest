package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = parseFunc(""""StatementListItem0LexicallyDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (LabelledStatement "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }""")
}