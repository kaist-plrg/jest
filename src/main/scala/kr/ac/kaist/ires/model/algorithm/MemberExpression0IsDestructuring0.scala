package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression0IsDestructuring0 extends Algorithm {
  val name: String = "MemberExpression0IsDestructuring0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression0IsDestructuring0" (this, PrimaryExpression) => {
    if (|| (is-instance-of PrimaryExpression ObjectLiteral) (is-instance-of PrimaryExpression ArrayLiteral)) return true else {}
    return false
  }"""), this)
}
