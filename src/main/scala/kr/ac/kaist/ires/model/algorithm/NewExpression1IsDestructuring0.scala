package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewExpression1IsDestructuring0 extends Algorithm {
  val name: String = "NewExpression1IsDestructuring0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""NewExpression1IsDestructuring0" (this, NewExpression) => return false"""), this)
}
