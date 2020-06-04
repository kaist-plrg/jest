package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsLabelledFunction extends Algorithm {
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IsLabelledFunction" (stmt) => {
    if (! (is-instance-of stmt LabelledStatement)) return false else {}
    access __x0__ = (stmt "LabelledItem")
    let item = __x0__
    if (is-instance-of item LabelledItem1) {
      access FunctionDeclaration = (item "FunctionDeclaration")
      return true
    } else {}
    access __x1__ = (item "Statement")
    let subStmt = __x1__
    app __x2__ = (IsLabelledFunction subStmt)
    return __x2__
  }"""))
}
